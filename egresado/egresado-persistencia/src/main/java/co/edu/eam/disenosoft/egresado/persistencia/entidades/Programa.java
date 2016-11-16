package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name=Programa.LISTA_DE_PROGRAMAS,query="SELECT p FROM Programa p")
})

@Entity
@Table(name="T_PROGRAMA")
public class Programa implements Serializable {

	public static final String LISTA_DE_PROGRAMAS = "Programa.listaProgramas";
	
	@Id
	@Column(name="ID_PROGRAMA")
	private int idPrograma;
	
	@ManyToOne
	@JoinColumn(name="ID_FACULTAD",nullable=false)
	private Facultad idFacultad;
	
	@Column(name="nombre_programa")
	private String nombrePrograma;
	
	public Programa(){
		
	}


	public Programa(int idPrograma, Facultad idFacultad, String nombrePrograma) {
		super();
		this.idPrograma = idPrograma;
		this.idFacultad = idFacultad;
		this.nombrePrograma = nombrePrograma;
	}


	/**
	 * @return the idPrograma
	 */
	public int getIdPrograma() {
		return idPrograma;
	}

	/**
	 * @param idPrograma the idPrograma to set
	 */
	public void setIdPrograma(int idPrograma) {
		this.idPrograma = idPrograma;
	}

	/**
	 * @return the idFacultad
	 */
	public Facultad getIdFacultad() {
		return idFacultad;
	}

	/**
	 * @param idFacultad the idFacultad to set
	 */
	public void setIdFacultad(Facultad idFacultad) {
		this.idFacultad = idFacultad;
	}
	
	public String getNombrePrograma() {
		return nombrePrograma;
	}


	public void setNombrePrograma(String nombrePrograma) {
		this.nombrePrograma = nombrePrograma;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFacultad == null) ? 0 : idFacultad.hashCode());
		result = prime * result + idPrograma;
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
		if (!(obj instanceof Programa)) {
			return false;
		}
		Programa other = (Programa) obj;
		if (idFacultad == null) {
			if (other.idFacultad != null) {
				return false;
			}
		} else if (!idFacultad.equals(other.idFacultad)) {
			return false;
		}
		if (idPrograma != other.idPrograma) {
			return false;
		}
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombrePrograma;
	}

	
	
	
	
}
