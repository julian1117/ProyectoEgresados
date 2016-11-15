package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import co.edu.eam.disenosoft.egresado.persistencia.enumeraciones.TipoEmpresa;

@NamedQueries({
	@NamedQuery(name=Empresa.LISTRA_EMPRESAS,query="SELECT e FROM Empresa e ")
})

@Entity
@Table(name="T_EMPRESA")
public class Empresa  implements Serializable{
	
	/**
	 * lista las empresas
	 */
	public static final String LISTRA_EMPRESAS = "Empresa.listarEmpresa";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_EMPRESA")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="ID_SECTOR",nullable=false)
	private SectorLaboral idSectorLaboral;
	
	@ManyToOne
	@JoinColumn(name="ID_CIUDAD",nullable=false)
	private Ciudad idCiudad;
	
	@Column(name="NOMBRE_EMPRESA")
	private String nombreEmpresa;
	
	@Column(name="RAZON_SOCIAL")
	private String razonSocial;
	
	@Column(name="NIT")
	private String nit;
	
	@Column(name="FAX")
	private String fax;
	
	@Column(name="TELEFONO")
	private String telefono;
	
	@Column(name="TIPO_EMPRESA")
	private String tipoEmpresa;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="PAIS")
	private String pais;
	
	@Column(name="CIUDAD")
	private String ciudad;
	
	@Column(name="DEPARTAMENTO")
	private String departamento;
	
	@Column(name="SITIO_WEB")
	private String sitioWeb;
	
//	@ManyToOne
//	@JoinColumn(name="ID_EGRESADO")
//	private InformacionLaboral infoLab;
	
	public Empresa(){
		
	}

	

	public Empresa(int id, SectorLaboral idSectorLaboral, Ciudad idCiudad, String nombreEmpresa, String razonSocial,
			String nit, String fax, String telefono, String tipoEmpresa, String direccion, String pais, String ciudad,
			String departamento, String sitioWeb) {
		super();
		this.id = id;
		this.idSectorLaboral = idSectorLaboral;
		this.idCiudad = idCiudad;
		this.nombreEmpresa = nombreEmpresa;
		this.razonSocial = razonSocial;
		this.nit = nit;
		this.fax = fax;
		this.telefono = telefono;
		this.tipoEmpresa = tipoEmpresa;
		this.direccion = direccion;
		this.pais = pais;
		this.ciudad = ciudad;
		this.departamento = departamento;
		this.sitioWeb = sitioWeb;
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
	 * @return the idSectorLaboral
	 */
	public SectorLaboral getIdSectorLaboral() {
		return idSectorLaboral;
	}

	/**
	 * @param idSectorLaboral the idSectorLaboral to set
	 */
	public void setIdSectorLaboral(SectorLaboral idSectorLaboral) {
		this.idSectorLaboral = idSectorLaboral;
	}

	/**
	 * @return the idCiudad
	 */
	public Ciudad getIdCiudad() {
		return idCiudad;
	}

	/**
	 * @param idCiudad the idCiudad to set
	 */
	public void setIdCiudad(Ciudad idCiudad) {
		this.idCiudad = idCiudad;
	}

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the nit
	 */
	public String getNit() {
		return nit;
	}

	/**
	 * @param nit the nit to set
	 */
	public void setNit(String nit) {
		this.nit = nit;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the tipoEmpresa
	 */
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	/**
	 * @param tipoEmpresa the tipoEmpresa to set
	 */
	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the sitioWeb
	 */
	public String getSitioWeb() {
		return sitioWeb;
	}

	/**
	 * @param sitioWeb the sitioWeb to set
	 */
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}


	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}



	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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
		if (!(obj instanceof Empresa)) {
			return false;
		}
		Empresa other = (Empresa) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return nombreEmpresa;
	}
	
	
	
	
}
