package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;
import java.util.jar.Attributes.Name;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@IdClass(OfertaAplicadaEgresadoPK.class)
@Entity
@Table(name="T_OFERTAAPLICADA_EGRE")
public class OfertaAplicadaEgresado implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name="ID_EGRESADAO")
	private Egresado egresado;
	
	@Id
	@ManyToOne
	@JoinColumn(name="ID_OFERTA")
	private OfertaLaboral ofertaLaboral;
	
	public OfertaAplicadaEgresado(){
		
	}

	public OfertaAplicadaEgresado(Egresado egresado, OfertaLaboral ofertaLaboral) {
		super();
		this.egresado = egresado;
		this.ofertaLaboral = ofertaLaboral;
	}
	
	public OfertaAplicadaEgresado(int egresado, int ofertaLaboral) {
		OfertaAplicadaEgresadoPK ap = new OfertaAplicadaEgresadoPK(egresado, ofertaLaboral);
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
	 * @return the ofertaLaboral
	 */
	public OfertaLaboral getOfertaLaboral() {
		return ofertaLaboral;
	}

	/**
	 * @param ofertaLaboral the ofertaLaboral to set
	 */
	public void setOfertaLaboral(OfertaLaboral ofertaLaboral) {
		this.ofertaLaboral = ofertaLaboral;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((egresado == null) ? 0 : egresado.hashCode());
		result = prime * result + ((ofertaLaboral == null) ? 0 : ofertaLaboral.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfertaAplicadaEgresado other = (OfertaAplicadaEgresado) obj;
		if (egresado == null) {
			if (other.egresado != null)
				return false;
		} else if (!egresado.equals(other.egresado))
			return false;
		if (ofertaLaboral == null) {
			if (other.ofertaLaboral != null)
				return false;
		} else if (!ofertaLaboral.equals(other.ofertaLaboral))
			return false;
		return true;
	}

	
	
}
