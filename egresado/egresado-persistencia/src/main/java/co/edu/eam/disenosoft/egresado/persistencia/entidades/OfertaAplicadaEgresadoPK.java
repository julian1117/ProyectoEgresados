package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

public class OfertaAplicadaEgresadoPK implements Serializable {

	private int egresado;
	
	private int ofertaLaboral;

	public OfertaAplicadaEgresadoPK(){
		
	}
	
	public OfertaAplicadaEgresadoPK(int egresado, int ofertaLaboral) {
		super();
		this.egresado = egresado;
		this.ofertaLaboral = ofertaLaboral;
	}

	/**
	 * @return the egresado
	 */
	public int getEgresado() {
		return egresado;
	}

	/**
	 * @param egresado the egresado to set
	 */
	public void setEgresado(int egresado) {
		this.egresado = egresado;
	}

	/**
	 * @return the ofertaLaboral
	 */
	public int getOfertaLaboral() {
		return ofertaLaboral;
	}

	/**
	 * @param ofertaLaboral the ofertaLaboral to set
	 */
	public void setOfertaLaboral(int ofertaLaboral) {
		this.ofertaLaboral = ofertaLaboral;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + egresado;
		result = prime * result + ofertaLaboral;
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
		if (!(obj instanceof OfertaAplicadaEgresadoPK)) {
			return false;
		}
		OfertaAplicadaEgresadoPK other = (OfertaAplicadaEgresadoPK) obj;
		if (egresado != other.egresado) {
			return false;
		}
		if (ofertaLaboral != other.ofertaLaboral) {
			return false;
		}
		return true;
	}
	
	
	
}
