package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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

@Entity
@Table(name="T_INFO_ACADEMICA")
public class InformacionAcademica implements Serializable{
	
	@Id	
	@OneToOne
	@JoinColumn(name="ID_EGRESADO", insertable = false, updatable = false)
	private Egresado egresado;

	
	@Column(name="FACULTA")
	private String facultad;
	
	@Column(name="PROGRAMA_ACADEMICO")
	private String programaAcademico;
	
	@Column(name="AREA_CONOCIMIENTO")
	private String areaConocimiento;
	
	@Column(name="FECHA_GRADO")
	private Date fechaGrado;
	
	@Column(name="NUMERO_DIPLOMA")
	private String numeroDiploma;
	
	@Column(name="MAXIMO_NIVEL_ACADEMICO")
	private String maximoNivelAcademico;
	
	public InformacionAcademica() {
		
	}

	public InformacionAcademica(Egresado egresado, String facultad, String programaAcademico, String areaConocimiento,
			Date fechaGrado, String numeroDiploma, String maximoNivelAcademico) {
		super();
		this.egresado = egresado;
		this.facultad = facultad;
		this.programaAcademico = programaAcademico;
		this.areaConocimiento = areaConocimiento;
		this.fechaGrado = fechaGrado;
		this.numeroDiploma = numeroDiploma;
		this.maximoNivelAcademico = maximoNivelAcademico;
	}

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
	}

	/**
	 * @return the facultad
	 */
	public String getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	/**
	 * @return the programaAcademico
	 */
	public String getProgramaAcademico() {
		return programaAcademico;
	}

	/**
	 * @param programaAcademico the programaAcademico to set
	 */
	public void setProgramaAcademico(String programaAcademico) {
		this.programaAcademico = programaAcademico;
	}

	/**
	 * @return the areaConocimiento
	 */
	public String getAreaConocimiento() {
		return areaConocimiento;
	}

	/**
	 * @param areaConocimiento the areaConocimiento to set
	 */
	public void setAreaConocimiento(String areaConocimiento) {
		this.areaConocimiento = areaConocimiento;
	}

	/**
	 * @return the fechaGrado
	 */
	public Date getFechaGrado() {
		return fechaGrado;
	}

	/**
	 * @param fechaGrado the fechaGrado to set
	 */
	public void setFechaGrado(Date fechaGrado) {
		this.fechaGrado = fechaGrado;
	}

	/**
	 * @return the numeroDiploma
	 */
	public String getNumeroDiploma() {
		return numeroDiploma;
	}

	/**
	 * @param numeroDiploma the numeroDiploma to set
	 */
	public void setNumeroDiploma(String numeroDiploma) {
		this.numeroDiploma = numeroDiploma;
	}

	/**
	 * @return the maximoNivelAcademico
	 */
	public String getMaximoNivelAcademico() {
		return maximoNivelAcademico;
	}

	/**
	 * @param maximoNivelAcademico the maximoNivelAcademico to set
	 */
	public void setMaximoNivelAcademico(String maximoNivelAcademico) {
		this.maximoNivelAcademico = maximoNivelAcademico;
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
		if (!(obj instanceof InformacionAcademica)) {
			return false;
		}
		InformacionAcademica other = (InformacionAcademica) obj;
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
