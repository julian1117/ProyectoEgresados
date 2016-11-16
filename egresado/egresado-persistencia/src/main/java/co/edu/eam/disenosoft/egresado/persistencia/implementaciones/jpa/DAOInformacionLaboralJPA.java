package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IInformacionLaboralDAO;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

/**
 * Clase que permite gestionar todos los metodos declarados en la interface
 * @author CAMILO
 *
 */
public class DAOInformacionLaboralJPA implements IInformacionLaboralDAO {

	/**
	 * crea una informacion laboral
	 */
	public void crearInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(infoLab);
		em.getTransaction().commit();
	}

	/**
	 * edita una informacion laboral
	 */
	public void editarInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.merge(infoLab);
		em.getTransaction().commit();
	}

	/**
	 * busca una informacion laboral
	 */
	public InformacionLaboral buscarInformacionLaboral(int id) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(InformacionLaboral.class, id);
	}

	/**
	 * lista los sectores laborales por medio de la consulta 
	 */
	public List<SectorLaboral> listaLaboral() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(SectorLaboral.LISTA_LABORAL);
		List<SectorLaboral> listaSeptor = q.getResultList();
		return listaSeptor;
	}

	/**
	 * Lista de toda la informacion laboral en la DB
	 */
	public List<InformacionLaboral> listaInfomracionLaboral() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(InformacionLaboral.LISTA_iNFROMACION_LABORAL);
		List<InformacionLaboral> listaInfomracionLaboral = q.getResultList();			
		return listaInfomracionLaboral;
	}

	/**
	 * Lista de informacion laboral por programa
	 */
	public List<InformacionLaboral> listaInfomracionLaboralPrograma(Programa programa) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(InformacionLaboral.LISTA_INFROMACION_LABORAL_POR_PROGRAMA);
		q.setParameter(1,programa);
		List<InformacionLaboral> listaPrograma = q.getResultList();
		return listaPrograma;
	}

}
