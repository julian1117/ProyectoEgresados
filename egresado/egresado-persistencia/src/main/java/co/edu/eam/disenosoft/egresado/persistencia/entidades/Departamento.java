package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name= Departamento.CONSULTA_LISTA_DEPARTAMENTO,query="select depto from Departamento depto")
})

@Entity
@Table(name="T_DEPARTAMENTO")
public class Departamento implements Serializable {
	
	public static final String CONSULTA_LISTA_DEPARTAMENTO = "Departamento.listarDepartamentos";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_DEPARTAMENTO")
	private int idDepartamento;
	
	@Column(name="NOMBRE_DEPARTAMENTO")
	private String nomDepartamento;
	
	@JoinColumn(name="ID_PAIS")
	private Pais pais;
	
	
	public Departamento(){
		
	}

	
	public Departamento(int idDepartamento, String nomDepartamento, Pais pais) {
		super();
		this.idDepartamento = idDepartamento;
		this.nomDepartamento = nomDepartamento;
		this.pais = pais;
	}


	/**
	 * @return the idDepartamento
	 */
	public int getIdDepartamento() {
		return idDepartamento;
	}

	/**
	 * @param idDepartamento the idDepartamento to set
	 */
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	/**
	 * @return the nomDepartamento
	 */
	public String getNomDepartamento() {
		return nomDepartamento;
	}

	/**
	 * @param nomDepartamento the nomDepartamento to set
	 */
	public void setNomDepartamento(String nomDepartamento) {
		this.nomDepartamento = nomDepartamento;
	}
	
	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}


	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDepartamento;
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
		if (!(obj instanceof Departamento)) {
			return false;
		}
		Departamento other = (Departamento) obj;
		if (idDepartamento != other.idDepartamento) {
			return false;
		}
		return true;
	}

	
	
	
	

}
