package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="T_CONTACTO")
public class Contacto implements Serializable {
	
	@Id
	@OneToOne
	@JoinColumn(name="ID_EMPRESA")
	private Empresa idEmpresa;
	
	@Column(name="NOMBRE")
	private String nombreCompleto;
	
	@Column(name="EMAIL")
	private String correoElectronico;
	
	@Column(name="CARGO_EMPRESA")
	private String cargoEmpresa;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	public Contacto(){
		
	}

	public Contacto(Empresa idEmpresa, String nombreCompleto, String correoElectronico, String cargoEmpresa,
			String telefono) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombreCompleto = nombreCompleto;
		this.correoElectronico = correoElectronico;
		this.cargoEmpresa = cargoEmpresa;
		this.telefono = telefono;
	}

	/**
	 * @return the idEmpresa
	 */
	public Empresa getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(Empresa idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 * @return the cargoEmpresa
	 */
	public String getCargoEmpresa() {
		return cargoEmpresa;
	}

	/**
	 * @param cargoEmpresa the cargoEmpresa to set
	 */
	public void setCargoEmpresa(String cargoEmpresa) {
		this.cargoEmpresa = cargoEmpresa;
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
		if (!(obj instanceof Contacto)) {
			return false;
		}
		Contacto other = (Contacto) obj;
		if (idEmpresa == null) {
			if (other.idEmpresa != null) {
				return false;
			}
		} else if (!idEmpresa.equals(other.idEmpresa)) {
			return false;
		}
		return true;
	}
	
	
}
