package com.tfg.inmobilaria.beansentity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the perfiles database table.
 * 
 */
@Entity
@Table(name="perfiles")
@NamedQuery(name="Perfile.findAll", query="SELECT p FROM Perfile p")
public class Perfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_PERFIL")
	private int idPerfil;

	private String descripcion;
	
	//Constructores
	public Perfile() {
	}

	public Perfile(int idPerfil, String descripcion) {
		super();
		this.idPerfil = idPerfil;
		this.descripcion = descripcion;
	}

	//Getters y Setters
	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//equals y hasCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPerfil;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfile other = (Perfile) obj;
		if (idPerfil != other.idPerfil)
			return false;
		return true;
	}
	
	//toString
	@Override
	public String toString() {
		return "Perfile [idPerfil=" + idPerfil + ", descripcion=" + descripcion + "]";
	}
	
}