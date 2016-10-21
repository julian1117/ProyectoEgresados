package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IContactoDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Contacto;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAOContactoJPA implements IContactoDAO {

	public void crearContacto(Contacto cont) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		
		em.persist(cont);
		
		em.getTransaction().commit();
		
	}

	public void editarContacto(Contacto cont) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();	
		em.getTransaction().begin();
		
		em.merge(cont);
		
		em.getTransaction().commit();
	}

	public Contacto buscarContacto(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();	
		return em.find(Contacto.class, id);
	}

	
}
