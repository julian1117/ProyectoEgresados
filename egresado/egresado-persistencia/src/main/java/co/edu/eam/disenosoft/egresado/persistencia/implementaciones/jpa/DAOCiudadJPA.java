package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.ICiudadDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAOCiudadJPA implements ICiudadDAO{

	/**
	 * lista las cuidades que han sido creadas
	 */
	public List<Ciudad> listarCiudad() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Ciudad.CONSULTA_LISTA_CIUDAD);
		List<Ciudad> listarCiudad = q.getResultList();
		return listarCiudad;
	}
	
	/**
	 * busca una ciudad que ya ha sido creada
	 */
	public Ciudad buscarCiudad(int ciudad) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Ciudad.class, ciudad);
	}

}
