package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = OfertaLaboral.LISTAR_AREA_INTERES,query = "SELECT id FROM OfertaLaboral o JOIN o.idArea id WHERE o.idOferta =?1"),
	@NamedQuery(name = OfertaLaboral.LISTAR_CIUDADA_OFERTA, query = "SELECT idC FROM OfertaLaboral o JOIN o.idCiudad idC WHERE o.idOferta =?1"),
	@NamedQuery(name = OfertaLaboral.LISTAR_OFERTA, query = "SELECT o FROM OfertaLaboral o")
})

@Entity
@Table(name = "T_OFERTALABORAL")
public class OfertaLaboral implements Serializable {

	/**
	 * lista las areas de interes de la oferta 
	 */
	public static final String LISTAR_AREA_INTERES = "OfertaLaboral.buscarAreasInteres"; 

	public static final String LISTAR_CIUDADA_OFERTA = "OfertaLaboral.buscarCiudades";
	
	public static final String LISTAR_OFERTA = "OfertaLaboral.listaOferta";
	
	@Id
	@Column(name = "ID_OFERTA")
	private int idOferta;

	@ManyToOne
	@JoinColumn(name = "ID_EMPRESA", nullable = false)
	private Empresa idempresa;

	@ManyToOne
	@JoinColumn(name = "ID_CIUDAD", nullable = false)
	private Ciudad idCiudad;

	@ManyToOne
	@JoinColumn(name = "ID_AREA", nullable = false)
	private AreaInteres idArea;

	@Column(name = "CARGO_OFRECER")
	private String cargoOfrecer;

	@Column(name = "SALARIO")
	private double salario;

	@Column(name = "FECHA_OFERTA")
	private Date fechaoferta;

	@Column(name = "FECHA_CIERRE")
	private Date fechaofertaCierre;
	
	@Column(name = "RESUMEN_OFERTA")
	private String resumen;

	@Column(name = "REQUISITO_OFERTA")
	private String requisitoOferta;

	@Column(name = "DESCRIPCION_OFERTA")
	private String descripcionOferta;

	@Column(name = "CERRAR_OFERTA")
	private boolean cerrarOferta;

	@JoinColumn(name="ID_PROGRAMA")
	private Programa programa;
	
	public OfertaLaboral() {

	}
	
	

	public OfertaLaboral(boolean cerrarOferta) {
		super();
		this.cerrarOferta = cerrarOferta;
	}






	public OfertaLaboral(int idOferta, Empresa idempresa, Ciudad idCiudad, AreaInteres idArea, String cargoOfrecer,
			double salario, Date fechaoferta, Date fechaofertaCierre, String resumen, String requisitoOferta,
			String descripcionOferta, boolean cerrarOferta, Programa programa) {
		super();
		this.idOferta = idOferta;
		this.idempresa = idempresa;
		this.idCiudad = idCiudad;
		this.idArea = idArea;
		this.cargoOfrecer = cargoOfrecer;
		this.salario = salario;
		this.fechaoferta = fechaoferta;
		this.fechaofertaCierre = fechaofertaCierre;
		this.resumen = resumen;
		this.requisitoOferta = requisitoOferta;
		this.descripcionOferta = descripcionOferta;
		this.cerrarOferta = cerrarOferta;
		this.programa = programa;
	}



	/**
	 * @return the idOferta
	 */
	public int getIdOferta() {
		return idOferta;
	}

	/**
	 * @param idOferta the idOferta to set
	 */
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	/**
	 * @return the idempresa
	 */
	public Empresa getIdempresa() {
		return idempresa;
	}

	/**
	 * @param idempresa the idempresa to set
	 */
	public void setIdempresa(Empresa idempresa) {
		this.idempresa = idempresa;
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
	 * @return the idArea
	 */
	public AreaInteres getIdArea() {
		return idArea;
	}

	/**
	 * @param idArea the idArea to set
	 */
	public void setIdArea(AreaInteres idArea) {
		this.idArea = idArea;
	}

	/**
	 * @return the cargoOfrecer
	 */
	public String getCargoOfrecer() {
		return cargoOfrecer;
	}

	/**
	 * @param cargoOfrecer the cargoOfrecer to set
	 */
	public void setCargoOfrecer(String cargoOfrecer) {
		this.cargoOfrecer = cargoOfrecer;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * @return the fechaoferta
	 */
	public Date getFechaoferta() {
		return fechaoferta;
	}

	/**
	 * @param fechaoferta the fechaoferta to set
	 */
	public void setFechaoferta(Date fechaoferta) {
		this.fechaoferta = fechaoferta;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/**
	 * @return the requisitoOferta
	 */
	public String getRequisitoOferta() {
		return requisitoOferta;
	}

	/**
	 * @param requisitoOferta the requisitoOferta to set
	 */
	public void setRequisitoOferta(String requisitoOferta) {
		this.requisitoOferta = requisitoOferta;
	}

	/**
	 * @return the descripcionOferta
	 */
	public String getDescripcionOferta() {
		return descripcionOferta;
	}

	/**
	 * @param descripcionOferta the descripcionOferta to set
	 */
	public void setDescripcionOferta(String descripcionOferta) {
		this.descripcionOferta = descripcionOferta;
	}

	/**
	 * @return the cerrarOferta
	 */
	public boolean isCerrarOferta() {
		return cerrarOferta;
	}

	/**
	 * @param cerrarOferta the cerrarOferta to set
	 */
	public void setCerrarOferta(boolean cerrarOferta) {
		this.cerrarOferta = cerrarOferta;
	}

	
	
	
	/**
	 * @return the fechaofertaCierre
	 */
	public Date getFechaofertaCierre() {
		return fechaofertaCierre;
	}



	/**
	 * @param fechaofertaCierre the fechaofertaCierre to set
	 */
	public void setFechaofertaCierre(Date fechaofertaCierre) {
		this.fechaofertaCierre = fechaofertaCierre;
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
		result = prime * result + ((idArea == null) ? 0 : idArea.hashCode());
		result = prime * result + ((idCiudad == null) ? 0 : idCiudad.hashCode());
		result = prime * result + idOferta;
		result = prime * result + ((idempresa == null) ? 0 : idempresa.hashCode());
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
		if (!(obj instanceof OfertaLaboral)) {
			return false;
		}
		OfertaLaboral other = (OfertaLaboral) obj;
		if (idArea == null) {
			if (other.idArea != null) {
				return false;
			}
		} else if (!idArea.equals(other.idArea)) {
			return false;
		}
		if (idCiudad == null) {
			if (other.idCiudad != null) {
				return false;
			}
		} else if (!idCiudad.equals(other.idCiudad)) {
			return false;
		}
		if (idOferta != other.idOferta) {
			return false;
		}
		if (idempresa == null) {
			if (other.idempresa != null) {
				return false;
			}
		} else if (!idempresa.equals(other.idempresa)) {
			return false;
		}
		return true;
	}
	
	

	
	
}
