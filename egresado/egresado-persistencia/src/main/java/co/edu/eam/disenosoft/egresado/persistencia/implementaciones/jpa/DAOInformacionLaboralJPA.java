package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IInformacionLaboralDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

/**
 * 
 * @author CAMILO
 *
 */
public class DAOInformacionLaboralJPA implements IInformacionLaboralDAO {

	/**
	 * 
	 */
	public void crearInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.persist(infoLab);

		em.getTransaction().commit();

	}

	/**
	 * 
	 */
	public void editarInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(infoLab);

		em.getTransaction().commit();
	}

	/**
	 * 
	 */
	public InformacionLaboral buscarInformacionLaboral(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InformacionLaboral.class, id);
	}

	/**
	 * 
	 */
	public List<SectorLaboral> listaLaboral() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(SectorLaboral.LISTA_LABORAL);
		List<SectorLaboral> listaSeptor = q.getResultList();
		return listaSeptor;
	}

}
