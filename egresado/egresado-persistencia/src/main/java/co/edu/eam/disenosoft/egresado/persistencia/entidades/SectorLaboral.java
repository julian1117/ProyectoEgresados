package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries({
	@NamedQuery(name=SectorLaboral.LISTA_LABORAL,query="SELECT s FROM SectorLaboral s")
})

@Entity
@Table(name="T_SECTORLABORAL")
public class SectorLaboral implements Serializable {
	
	public static final String LISTA_LABORAL = "SectorLaboral.listaLaboral";
	
	@Id
	@Column(name="ID_SECTORLABORAL")
	private int idSectoLaboral;
	
	@Column(name="NOM_SECTORLABORAL")
	private String nombreSector;
	
	public SectorLaboral(){
		
	}

	public SectorLaboral(int idSectoLaboral, String nombreSector) {
		super();
		this.idSectoLaboral = idSectoLaboral;
		this.nombreSector = nombreSector;
	}

	/**
	 * @return the idSectoLaboral
	 */
	public int getIdSectoLaboral() {
		return idSectoLaboral;
	}

	/**
	 * @param idSectoLaboral the idSectoLaboral to set
	 */
	public void setIdSectoLaboral(int idSectoLaboral) {
		this.idSectoLaboral = idSectoLaboral;
	}

	/**
	 * @return the nombreSector
	 */
	public String getNombreSector() {
		return nombreSector;
	}

	/**
	 * @param nombreSector the nombreSector to set
	 */
	public void setNombreSector(String nombreSector) {
		this.nombreSector = nombreSector;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSectoLaboral;
		result = prime * result + ((nombreSector == null) ? 0 : nombreSector.hashCode());
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
		if (!(obj instanceof SectorLaboral)) {
			return false;
		}
		SectorLaboral other = (SectorLaboral) obj;
		if (idSectoLaboral != other.idSectoLaboral) {
			return false;
		}
		if (nombreSector == null) {
			if (other.nombreSector != null) {
				return false;
			}
		} else if (!nombreSector.equals(other.nombreSector)) {
			return false;
		}
		return true;
	}

	
}
