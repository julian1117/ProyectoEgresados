package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@IdClass(AreasEgresadoPK.class)
@Entity
@Table(name="T_AREAS_EGRESADO")
public class AreasEgresado implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name="ID_EGRESADO")
	private Egresado idEgresado;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ID_AREAINTERES")
	private AreaInteres areaInt;
	
	public AreasEgresado(){
		
	}

	public AreasEgresado(Egresado idEgresado, AreaInteres areaInt) {
		super();
		this.idEgresado = idEgresado;
		this.areaInt = areaInt;
	}

	/**
	 * @return the idEgresado
	 */
	public Egresado getIdEgresado() {
		return idEgresado;
	}

	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(Egresado idEgresado) {
		this.idEgresado = idEgresado;
	}

	/**
	 * @return the areaInt
	 */
	public AreaInteres getAreaInt() {
		return areaInt;
	}

	/**
	 * @param areaInt the areaInt to set
	 */
	public void setAreaInt(AreaInteres areaInt) {
		this.areaInt = areaInt;
	}
	
	
}
