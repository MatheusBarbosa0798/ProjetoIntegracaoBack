package eletra.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medidores")
public class Products implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id", unique = true)
	private int id;
	
	@Column(name = "linha", nullable = false)
	private String linha;
	
	@Column(name = "categoria", nullable = false)
	private String categoria;
	
	@Column(name = "modelo", nullable = false)
	private String modelo;
	
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
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
	
	
	
}
