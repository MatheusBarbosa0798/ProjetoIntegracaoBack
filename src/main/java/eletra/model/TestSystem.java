package eletra.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestSystem {
	
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY = 
			Persistence.createEntityManagerFactory("ProjetoIntegracaoBack");


	public static void main(String[] args) {
		getProducts();
		
		ENTITY_MANAGER_FACTORY.close();
	}

	
	public static void addProduct(int id, String linha, String categoria, String modelo) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		Products produ = new Products();

		try {
			et = em.getTransaction();
			et.begin();
			produ.setID(id);
			produ.setLinha(linha);
			produ.setCategoria(categoria);
			produ.setModelo(modelo);
			em.persist(produ);
			et.commit();
		}
		catch (Exception ex) {
			if(et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
		
	}
	
	public static Products getProduct(int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String query = "SELECT p FROM Products p WHERE p.id = :id";
		
		TypedQuery<Products> tq = em.createQuery(query, Products.class);
		tq.setParameter("id", id);
		Products produ =  null;
		try {
			produ = tq.getSingleResult();
			//System.out.println(produ.getLinha()+""+produ.getCategoria()+""+produ.getModelo());	
		}
		catch (NoResultException ex) {
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
		return produ;
	}
	
	public static void getProducts() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		String strquery = "SELECT p FROM Products p WHERE p.id IS NOT NULL";
		TypedQuery<Products> tq = em.createQuery(strquery, Products.class);
		List<Products> products;
		try {
			products = tq.getResultList();
			products.forEach(produ->System.out.println(produ.getLinha()+" "+
			produ.getCategoria()+" "+produ.getModelo()));
		}
		catch (NoResultException ex) {
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
		
	}
	
	public static void changeModel(int id,String modelo) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		Products produ = null;
		
		try {
			et = em.getTransaction();
			et.begin();
			produ = em.find(Products.class, id);
			produ.setModelo(modelo);
			em.persist(produ);
			et.commit();
		}
		catch (Exception ex) {
			if(et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
		
	}
	
	public static void deleteProduct(int id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = null;
		Products produ = null;
		try {
			et = em.getTransaction();
			et.begin();
			produ = em.find(Products.class, id);
			em.remove(produ);			
			em.persist(produ);
			et.commit();
		}
		catch (Exception ex) {
			if(et != null) {
				et.rollback();
			}
			ex.printStackTrace();
		}
		finally {
			em.close();
		}
		
	}	
	
}
