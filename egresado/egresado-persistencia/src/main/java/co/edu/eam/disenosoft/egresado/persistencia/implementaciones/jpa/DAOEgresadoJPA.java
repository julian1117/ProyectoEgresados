package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import javax.persistence.EntityManager;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IEgresadoDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;
/**
 * DAOEgresadoJPA, permite gestionar todo lo relacionado con la entidad egresado
 * @author CAMILO
 *
 */
public class DAOEgresadoJPA implements IEgresadoDAO{

	//Crea un registro de egresado 
	public void crearEgresado(Egresado egresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(egresado);
		
		em.getTransaction().commit();
		
	}

	//Edita un registro de egresado
	public void editarEgresado(Egresado egresado) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();
		
		em.merge(egresado);
		
		em.getTransaction().commit();
		
	}

	//Busca un registro de egresado
	public Egresado buscarEgresado(int idEgresado) {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Egresado.class, idEgresado);
	}

}
