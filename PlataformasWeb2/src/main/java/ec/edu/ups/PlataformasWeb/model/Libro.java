package ec.edu.ups.PlataformasWeb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {
	
	@Id
	private int codigo;
	private String nombre;
	private String autor;
	private String arePertenencia;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getArePertenencia() {
		return arePertenencia;
	}
	public void setArePertenencia(String arePertenencia) {
		this.arePertenencia = arePertenencia;
	}
	
}
