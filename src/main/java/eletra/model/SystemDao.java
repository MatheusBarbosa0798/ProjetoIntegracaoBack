package eletra.model;
 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
 
public class SystemDao implements SystemDaoInterface<Products, String> {
 
    private Session currentSession;
     
    private Transaction currentTransaction;
    

    public SystemDao() {
    }
 
    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }
 
    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }
     
    public void closeCurrentSession() {
        currentSession.close();
    }
     
    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }
     
    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
       // SessionFactory sessionFactory = configuration.buildSessionFactory();
       // Session session = sessionFactory.getCurrentSession();
        
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build()); 
        return sessionFactory;
    }
 
    public Session getCurrentSession() {
        return currentSession;
    }
 
    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }
 
    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }
 
    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }
 
    public void persist(Products entity) {
        getCurrentSession().save(entity);
    }
 
    public void update(Products entity) {
        getCurrentSession().update(entity);
    }
 
    public Products findById(int id) {
    	Products meter = (Products) getCurrentSession().get(Products.class, id);
        return meter; 
    }
 
    public void delete(Products entity) {
        getCurrentSession().delete(entity);
    }
 
    @SuppressWarnings("unchecked")
    public List<Products> findAll() {
        List<Products> meters = (List<Products>) getCurrentSession().createQuery("from Products").list();
        return meters;
    }
 
    public void deleteAll() {
        List<Products> entityList = findAll();
        for (Products entity : entityList) {
            delete(entity);
        }
    }
    
    @Override
	public Products findById(String id) {
		return null;
	}
    
}