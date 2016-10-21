package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@IdClass(HistLaboralPK.class)
@Entity
@Table(name="T_HIS_LABORAL")
public class HistLaboral implements Serializable {
	

	@Id
	@ManyToOne
	@JoinColumn(name="ID_EGRESADO")
	private InformacionLaboral idEgresado;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ID_EMPRESA")
	private Empresa idEmpresa;
	
	public HistLaboral(){
		
	}

	public HistLaboral(InformacionLaboral idEgresado, Empresa idEmpresa) {
		super();
		this.idEgresado = idEgresado;
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the idEgresado
	 */
	public InformacionLaboral getIdEgresado() {
		return idEgresado;
	}

	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(InformacionLaboral idEgresado) {
		this.idEgresado = idEgresado;
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

	


	
	
}
