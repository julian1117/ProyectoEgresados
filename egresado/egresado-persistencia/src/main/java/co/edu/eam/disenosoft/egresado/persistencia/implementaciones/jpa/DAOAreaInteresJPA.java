package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IAreaInteresDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;
/**
 * DAOAreaInteresJPA,permite gestionar todo lo relacionado con la entidad AreaInteres
 * @author CAMILO
 *
 */
public class DAOAreaInteresJPA implements IAreaInteresDAO{

	//Crea un registro de un area de interes
	public void crearAreaInteres(AreaInteres area) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(area);
		
		em.getTransaction().commit();
		
	}

	//Edita un registro de una area de interes
	public void editarAreaInteres(AreaInteres area) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		
		em.getTransaction().begin();
		
		em.merge(area);
		
		em.getTransaction().commit();
		
	}

	//Busca un registro de un area de interes que este registrada, si no hay registro retorna null
	public AreaInteres buscarAreaInteres(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(AreaInteres.class, id);
	}

	/**
	 * lista las areas de interes creadas
	 */
	public List<AreaInteres> listarAreas() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		Query q = em.createNamedQuery(AreaInteres.CONSULTA_LISTAR_AREAS);
		List<AreaInteres> listaOfer = q.getResultList();
		return listaOfer;
	}
	
}
