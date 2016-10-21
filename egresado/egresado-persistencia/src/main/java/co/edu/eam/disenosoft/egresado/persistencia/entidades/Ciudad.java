package co.edu.eam.disenosoft.egresado.persistencia.entidades;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name = Ciudad.CONSULTA_LISTA_CIUDAD, query = "select ciu from Ciudad ciu")
})

@Entity
@Table(name="T_CIUDAD")
public class Ciudad implements Serializable {

	public static final String CONSULTA_LISTA_CIUDAD = "Ciudad.listarCiudades"; 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CIUDAD")
	private int idCiudad;
	
	@ManyToOne
	@JoinColumn(name="ID_DEPARTAMENTO",nullable= false)
	private Departamento depto;
	
	@Column(name="NOM_CIUDAD")
	private String nombre;
	
	public Ciudad(){
		
	}

	public Ciudad(int idCiudad, Departamento depto, String nombre) {
		super();
		this.idCiudad = idCiudad;
		this.depto = depto;
		this.nombre = nombre;
	}

	/**
	 * @return the idCiudad
	 */
	public int getIdCiudad() {
		return idCiudad;
	}

	/**
	 * @param idCiudad the idCiudad to set
	 */
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	/**
	 * @return the depto
	 */
	public Departamento getDepto() {
		return depto;
	}

	/**
	 * @param depto the depto to set
	 */
	public void setDepto(Departamento depto) {
		this.depto = depto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depto == null) ? 0 : depto.hashCode());
		result = prime * result + idCiudad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		if (!(obj instanceof Ciudad)) {
			return false;
		}
		Ciudad other = (Ciudad) obj;
		if (depto == null) {
			if (other.depto != null) {
				return false;
			}
		} else if (!depto.equals(other.depto)) {
			return false;
		}
		if (idCiudad != other.idCiudad) {
			return false;
		}
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		return true;
	}

	
	
	
}
