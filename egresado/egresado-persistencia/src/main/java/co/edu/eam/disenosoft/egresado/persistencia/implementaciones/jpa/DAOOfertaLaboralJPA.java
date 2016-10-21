package co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.egresado.persistencia.definiciones.IOfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.utilidades.AdministradorEntityManager;

public class DAOOfertaLaboralJPA implements IOfertaLaboral {

	/**
	 * crea una oferta laboral
	 */
	public void crearOfertaLaboral(OfertaLaboral ofertaLa) throws Exception {
		
		EntityManager em = AdministradorEntityManager.getEntityManager();
		em.getTransaction().begin();
		em.persist(ofertaLa);
		em.getTransaction().commit();

	}

	/**
	 * busca una empresa ya creada
	 */
	public Empresa buscarEmpresa(int idEm) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(Empresa.class, idEm);
	}

	/**
	 * busca una oferta laboral ya creada
	 */
	public OfertaLaboral buscarOferta(int idOferta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		return em.find(OfertaLaboral.class, idOferta);
	}

	
	/**
	 * edita una oferta laboral para cerrar una oferta
	 */
	public void editarOferta (OfertaLaboral Oferta) throws Exception{
		
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(Oferta);
		//JOptionPane.showMessageDialog(null, idOferta);
		em.getTransaction().commit();
		
		
	}

	/**
	 * lista las areas de interes por medio de la consulta
	 */
	public List<AreaInteres> listtarAreasIn(OfertaLaboral idOferta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(OfertaLaboral.LISTAR_AREA_INTERES);
		q.setParameter(1, idOferta.getIdOferta());
		List<AreaInteres> listarArea = q.getResultList();
		return listarArea;
	}

	/**
	 * lista la cuidad por medio de la consulta
	 */
	public List<Ciudad> listarCiudadOf(OfertaLaboral idOf) throws Exception {
	
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(OfertaLaboral.LISTAR_CIUDADA_OFERTA);
		q.setParameter(1, idOf.getIdOferta());
		List<Ciudad> listarCiudad = q.getResultList();
		return listarCiudad;
	}

	public List<OfertaLaboral> listaOferta() throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(OfertaLaboral.LISTAR_OFERTA);
		List<OfertaLaboral> listaOfertaLab= q.getResultList();
		return listaOfertaLab;
	}

	
	/**
	 * lista las empresas que han sido registrada por medio de la consulta
	 */
	public List<Empresa> listaEmpresa() throws Exception {
			EntityManager em = AdministradorEntityManager.getEntityManager();
			Query q = em.createNamedQuery(Empresa.LISTRA_EMPRESAS);
			List<Empresa> listarCiudad = q.getResultList();
			return listarCiudad;
		}
	

}