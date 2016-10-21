package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_EGRESADO")
public class Egresado implements Serializable{

	@Id	
	@Column(name="ID_EGRESADO")
	private int id;	
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="APELLIDO")
	private String apellido;
	@ManyToOne
	@JoinColumn(name="ID_PROGRAMA")
	private Programa programa;
	@Column(name="EMAIL")
	private String email;
	@Column(name="TELEFONO")
	private String telefono;
	@Column(name="CELULAR")
	private String celular;
	@Column(name="tipoDocumento")
	private String tipoDoc;
	
	
	
	@OneToOne(mappedBy="egresado")
	private InformacionLaboral infoLaboraal;
	
	public Egresado(){
		
	}

	
	
	public Egresado(int id, String nombre, String apellido, Programa programa, String email, String telefono,
			String celular, String tipoDoc, InformacionLaboral infoLaboraal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.programa = programa;
		this.email = email;
		this.telefono = telefono;
		this.celular = celular;
		this.tipoDoc = tipoDoc;
		this.infoLaboraal = infoLaboraal;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the programa
	 */
	public Programa getPrograma() {
		return programa;
	}

	/**
	 * @param programa the programa to set
	 */
	public void setPrograma(Programa programa) {
		this.programa = programa;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the infoLaboraal
	 */
	public InformacionLaboral getInfoLaboraal() {
		return infoLaboraal;
	}
	
	/** 
	 * @return the tipoDoc
	 */
	public String getTipoDoc() {
		return tipoDoc;
	}

	/**
	 * @param tipoDoc
	 */
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	/**
	 * @param infoLaboraal the infoLaboraal to set
	 */
	public void setInfoLaboraal(InformacionLaboral infoLaboraal) {
		this.infoLaboraal = infoLaboraal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (!(obj instanceof Egresado)) {
			return false;
		}
		Egresado other = (Egresado) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	
		
}
