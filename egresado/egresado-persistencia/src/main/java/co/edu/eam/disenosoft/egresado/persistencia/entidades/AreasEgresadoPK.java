package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

public class AreasEgresadoPK implements Serializable{

	private int idEgresado;
	
	private int areaInt;
	
	public AreasEgresadoPK() {
		
	}

	public AreasEgresadoPK(int idEgresado, int areaInt) {
		super();
		this.idEgresado = idEgresado;
		this.areaInt = areaInt;
	}

	public int getIdEgresado() {
		return idEgresado;
	}

	public void setIdEgresado(int idEgresado) {
		this.idEgresado = idEgresado;
	}

	public int getAreaInt() {
		return areaInt;
	}

	public void setAreaInt(int areaInt) {
		this.areaInt = areaInt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + areaInt;
		result = prime * result + idEgresado;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AreasEgresadoPK other = (AreasEgresadoPK) obj;
		if (areaInt != other.areaInt)
			return false;
		if (idEgresado != other.idEgresado)
			return false;
		return true;
	}
	
	

}
