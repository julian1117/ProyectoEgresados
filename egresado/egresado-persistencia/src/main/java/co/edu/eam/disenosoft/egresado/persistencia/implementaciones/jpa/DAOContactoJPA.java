package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IContactoDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase que permite gestionar todos los metodos declarados en la interface
 * @author laura posada
 *
 */
public class DAOContactoJPA implements IContactoDAO {

	/**
	 * crea un contacto
	 */
	public void crearContacto(Contacto cont) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		
		em.persist(cont);
		
		em.getTransaction().commit();
		
	}

	/**
	 * edita un contacto
	 */
	public void editarContacto(Contacto cont) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();	
		em.getTransaction().begin();
		
		em.merge(cont);
		
		em.getTransaction().commit();
	}

	/**
	 * busca un contacto
	 */
	public Contacto buscarContacto(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();	
		return em.find(Contacto.class, id);
	}

	
}
