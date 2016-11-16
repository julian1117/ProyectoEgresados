package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = AreaInteres.CONSULTA_LISTAR_AREAS, query = "select a from AreaInteres a ") })

@Entity
@Table(name = "T_AREAINTERES")
public class AreaInteres implements Serializable {

	/**
	 * consulta para listar las areas de interes
	 */
	public static final String CONSULTA_LISTAR_AREAS = "AreaInteres.listarAreas";

	@Id
	@Column(name = "ID_AREA")
	private int idArea;

	@Column(name = "NOMBRE_AREA")
	private String nombre;

	public AreaInteres() {

	}

	public AreaInteres(int idArea, String nombre) {
		super();
		this.idArea = idArea;
		this.nombre = nombre;
	}

	/**
	 * @return the idArea
	 */
	public int getIdArea() {
		return idArea;
	}

	/**
	 * @param idArea
	 *            the idArea to set
	 */
	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idArea;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AreaInteres)) {
			return false;
		}
		AreaInteres other = (AreaInteres) obj;
		if (idArea != other.idArea) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombre;
	}
	
	

}
