package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
/**
 * 
 * @author CAMILO
 *
 */
@NamedQueries({
	@NamedQuery(name=Facultad.LISTA_DE_FACULTADES,query="SELECT f FROM Facultad f")
})

@Entity
@Table(name="T_FACULTAD")
public class Facultad implements Serializable{

	public static final String LISTA_DE_FACULTADES = "Faculted.listaFacultades";
	
	
	@Id
	@Column(name="ID_FACULTAD")
	private int idFacultad;
	
	@Column(name="NOMBRE_FACULTAD")
	private String nombreFacultad;
	
	public Facultad(){
		
	}

	public Facultad(int idFacultad, String nombreFacultad) {
		super();
		this.idFacultad = idFacultad;
		this.nombreFacultad = nombreFacultad;
	}

	/**
	 * @return the idFacultad
	 */
	public int getIdFacultad() {
		return idFacultad;
	}

	/**
	 * @param idFacultad the idFacultad to set
	 */
	public void setIdFacultad(int idFacultad) {
		this.idFacultad = idFacultad;
	}

	/**
	 * @return the nombreFacultad
	 */
	public String getNombreFacultad() {
		return nombreFacultad;
	}

	/**
	 * @param nombreFacultad the nombreFacultad to set
	 */
	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idFacultad;
		result = prime * result + ((nombreFacultad == null) ? 0 : nombreFacultad.hashCode());
		return result;
	}

	/* (non-Javadoc)
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
		if (!(obj instanceof Facultad)) {
			return false;
		}
		Facultad other = (Facultad) obj;
		if (idFacultad != other.idFacultad) {
			return false;
		}
		if (nombreFacultad == null) {
			if (other.nombreFacultad != null) {
				return false;
			}
		} else if (!nombreFacultad.equals(other.nombreFacultad)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return nombreFacultad;
	}
	
	
	
}
