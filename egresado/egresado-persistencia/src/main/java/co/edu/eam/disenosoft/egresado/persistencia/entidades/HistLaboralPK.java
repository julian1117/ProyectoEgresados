package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

public class HistLaboralPK implements Serializable{

	private int idEgresado;
	
	private int idEmpresa;

	public HistLaboralPK(int idEgresado, int idEmpresa) {
		super();
		this.idEgresado = idEgresado;
		this.idEmpresa = idEmpresa;
	}

	/**
	 * @return the idEgresado
	 */
	public int getIdEgresado() {
		return idEgresado;
	}

	/**
	 * @param idEgresado the idEgresado to set
	 */
	public void setIdEgresado(int idEgresado) {
		this.idEgresado = idEgresado;
	}

	/**
	 * @return the idEmpresa
	 */
	public int getIdEmpresa() {
		return idEmpresa;
	}

	/**
	 * @param idEmpresa the idEmpresa to set
	 */
	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEgresado;
		result = prime * result + idEmpresa;
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
		if (!(obj instanceof HistLaboralPK)) {
			return false;
		}
		HistLaboralPK other = (HistLaboralPK) obj;
		if (idEgresado != other.idEgresado) {
			return false;
		}
		if (idEmpresa != other.idEmpresa) {
			return false;
		}
		return true;
	}
	
	
	
}
