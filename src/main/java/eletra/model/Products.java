package eletra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "medidores")
public class Products {
 
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
     
    @Column(name = "linha")
    private String linha;
     
    @Column(name= "categoria")
    private String categoria;
    
    @Column(name = "modelo")
    private String modelo;
     
    public Products() {
    }
 
    public Products(String linha, String categoria, String modelo) {
        this.linha = linha;
        this.categoria = categoria;
        this.modelo = modelo;
    }
     
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
    
    public String getLinha() {
        return linha;
    }
 
    public void setLinha(String linha) {
        this.linha = linha;
    }
 
    public String getCategoria() {
        return categoria;
    }
 
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     
    @Override
    public String toString() {
        return "Product: " + this.linha + " " + this.categoria + " " + this.modelo;
    }
}    
