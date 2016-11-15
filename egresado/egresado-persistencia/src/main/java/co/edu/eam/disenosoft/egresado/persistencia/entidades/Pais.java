package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name=Pais.LISTRA_PAIS,query="SELECT p FROM Pais p")
})
/**
 * Clase para administrar los paises
 * @author CAMILO
 *
 */
@Entity
@Table(name="T_PAIS")
public class Pais implements Serializable{

	public static final String LISTRA_PAIS = "Pais.listaPais";	
	
	@Id
	@Column(name="ID_PAIS")
	private int idPais;
	
	@Column(name="NOMBRE_PAIS")
	private String nomPais;
	
	public Pais() {
		// TODO Auto-generated constructor stub
	}

	public Pais(int idPais, String nomPais) {
		super();
		this.idPais = idPais;
		this.nomPais = nomPais;
	}

	/**
	 * @return the idPais
	 */
	public int getIdPais() {
		return idPais;
	}

	/**
	 * @param idPais the idPais to set
	 */
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	/**
	 * @return the nomPais
	 */
	public String getNomPais() {
		return nomPais;
	}

	/**
	 * @param nomPais the nomPais to set
	 */
	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPais;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (idPais != other.idPais)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nomPais;
	}
	
	

}
