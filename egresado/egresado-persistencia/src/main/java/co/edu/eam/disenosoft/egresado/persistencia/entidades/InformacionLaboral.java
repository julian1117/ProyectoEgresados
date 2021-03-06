package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mysql.fabric.jdbc.FabricMySQLDataSource;

@NamedQueries({
	@NamedQuery(name=InformacionLaboral.LISTA_iNFROMACION_LABORAL,query="SELECT i FROM InformacionLaboral i"),
	@NamedQuery(name=InformacionLaboral.LISTA_INFROMACION_LABORAL_POR_PROGRAMA,query="SELECT i FROM InformacionLaboral i WHERE i.programa=?1"),
	@NamedQuery(name=InformacionLaboral.LISTA_INFROMACION_LABORAL_POR_EMPRESA,query="SELECT i FROM InformacionLaboral i WHERE i.empresa=?1")
})

@Entity
@Table(name="T_INFO_LABORAL")
public class InformacionLaboral implements Serializable {

	public static final String LISTA_iNFROMACION_LABORAL = "InformacionLaboral.listaInfomracionLaboral";
	public static final String LISTA_INFROMACION_LABORAL_POR_PROGRAMA = "InformacionLaboral.listaInfomracionLaboralPrograma";
	public static final String LISTA_INFROMACION_LABORAL_POR_EMPRESA = "InformacionLaboral.listaInformacionLabEmpresa";
	
	@Id
	@Column(name="ID_EGRESADO")
	private int codEgresado;	
	
	@OneToOne
	@JoinColumn(name="ID_EGRESADO", insertable=false, updatable=false)
	private Egresado egresado;
	
	@Column(name="SITUACION_LABORAL")
	private String situcionLaboral;
	
	@Column(name="SECTOR_LABORAL")
	private String sectorLaboral;
	
	@Column(name="TIPO_EMPRESA")
	private String tipoEmpresa;
	
	@Column(name="CARGO_EMPRESA")
	private String cargoEmpresa;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INGRESO")
	private Date fechaIngreso;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_SALIDA")
	private Date fechaSalida;
	
	@ManyToOne
	@JoinColumn(name="ID_EMPRESA")
	private Empresa empresa;
	
	@ManyToOne
	@JoinColumn(name="ID_PROGRAMA")
	private Programa programa;
	
//	@ManyToOne
//	@JoinColumn(name="ID_EMPRESA")
//	private Empresa emp;
	
	public InformacionLaboral(){
		
	}

	
	public InformacionLaboral(int codEgresado, Egresado egresado, String situcionLaboral, String sectorLaboral,
		String tipoEmpresa, String cargoEmpresa, Date fechaIngreso, Date fechaSalida,
		Empresa empresa) {
	super();
	//this.codEgresado = codEgresado;
	this.egresado = egresado;
	this.situcionLaboral = situcionLaboral;
	this.sectorLaboral = sectorLaboral;
	this.tipoEmpresa = tipoEmpresa;
	this.cargoEmpresa = cargoEmpresa;
	this.fechaIngreso = fechaIngreso;
	this.fechaSalida = fechaSalida;
	this.empresa = empresa;
}







	/**
	 * @return the codEgresado
	 */
	public int getCodEgresado() {
		return codEgresado;
	}

	/**
	 * @param codEgresado the codEgresado to set
	 */
//	public void setCodEgresado(int codEgresado) {
//		this.codEgresado = egresado.getId();
//	}

	/**
	 * @return the egresado
	 */
	public Egresado getEgresado() {
		return egresado;
	}

	/**
	 * @param egresado the egresado to set
	 */
	public void setEgresado(Egresado egresado) {
		this.egresado = egresado;
		codEgresado=egresado.getId();
	}

	/**
	 * @return the situcionLaboral
	 */
	public String getSitucionLaboral() {
		return situcionLaboral;
	}

	/**
	 * @param situcionLaboral the situcionLaboral to set
	 */
	public void setSitucionLaboral(String situcionLaboral) {
		this.situcionLaboral = situcionLaboral;
	}

	/**
	 * @return the sectorLaboral
	 */
	public String getSectorLaboral() {
		return sectorLaboral;
	}

	/**
	 * @param sectorLaboral the sectorLaboral to set
	 */
	public void setSectorLaboral(String sectorLaboral) {
		this.sectorLaboral = sectorLaboral;
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
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the fechaSalida
	 */
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	
	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}


	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egresado == null) ? 0 : egresado.hashCode());
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
		if (!(obj instanceof InformacionLaboral)) {
			return false;
		}
		InformacionLaboral other = (InformacionLaboral) obj;
		if (egresado == null) {
			if (other.egresado != null) {
				return false;
			}
		} else if (!egresado.equals(other.egresado)) {
			return false;
		}
		return true;
	}

	
	
	
}
