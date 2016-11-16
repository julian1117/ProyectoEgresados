package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IFacultadDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase que permite gestionar todos los metodos declarados en la interface
 * @author laura posada
 * 16/11/2016
 */
public class DAOFacultadJPA implements IFacultadDAO{

	/**
	 * crea una facultad
	 */
	public void crearFacultad(Facultad fac) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();		
		em.getTransaction().begin();		
		em.persist(fac);		
		em.getTransaction().commit();			
	}

	/**
	 * edita una facultad
	 */
	public void editarFacultad(Facultad fac) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();		
		em.getTransaction().begin();		
		em.merge(fac);		
		em.getTransaction().commit();		
	}

	/**
	 * busca una facultad
	 */
	public Facultad buscarFacultad(int idFac) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Facultad.class, idFac);
	}
}
