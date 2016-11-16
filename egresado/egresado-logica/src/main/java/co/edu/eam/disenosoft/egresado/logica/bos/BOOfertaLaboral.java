package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOOfertaLaboralJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BOOfertaLaboral {

	/**
	 * se llama el dao de la oferta
	 */
	private DAOOfertaLaboralJPA daoOferta;

	/**
	 * constructor de la clase
	 */
	public BOOfertaLaboral() {
		daoOferta = new DAOOfertaLaboralJPA();
	}

	/**
	 * metodo que crea una oferta laboral por medio de la 
	 * clase DAOOfertaLaboralJPA
	 * @param ofertaLa objeto que recibe para ser creada
	 * @throws Exception que informa que la oferta ya se encuentra registrada
	 */
	public void crearOfertaLaboral(OfertaLaboral ofertaLa) throws Exception {
		
		OfertaLaboral oferta = daoOferta.buscarOferta(ofertaLa.getIdOferta());
		
		if(oferta == null){
			daoOferta.crearOfertaLaboral(ofertaLa);
		}else{
			throw new ExcepcionNegocio("La oferta laborla ya se encuentra resgistrada");
		}
		
	}
	
	/**
	 * metodo que busca una empresa por medio de la 
	 * clase DAOOfertaLaboralJPA
	 * @param idEm objeto de el d por el cual va a ser
	 * buscada la oferta laboral
	 * @return los resultados de la busqueda
	 * @throws Exception
	 */
	public Empresa buscarEmpresa (int idEm) throws Exception{
		return daoOferta.buscarEmpresa(idEm);
	}
	
	/**
	 * metodo que busca una oferta laboral por medio de la
	 * clase DAOOfertaLaboralJPA
	 * @param idOferta el objeto de el id de la oferta por la cual
	 * va a ser buscada
	 * @return los resultados de la busqueda
	 * @throws Exception
	 */
	public OfertaLaboral buscarOferta(int idOferta) throws Exception {
		return daoOferta.buscarOferta(idOferta);
	}
	
	/**
	 * metodo que edita una oferta para poder cerrarla por medio de la
	 * clase DAOOfertaLaboralJPA
	 * @param idOferta el objeto de id de la oferta por la cual 
	 * se va a editar
	 * @throws Exception
	 */
	public void editarOferta (OfertaLaboral Oferta) throws Exception{
		daoOferta.editarOferta(Oferta);
	}
	
	/**
	 * metodo que lista las areas de interes por medio de la consulta
	 * @param idOferta el objeto que recibe la consulta para hacer la busqueda
	 * @return lista las areas encontradas
	 * @throws Exception
	 */
	public List<AreaInteres> listtarAreasIn(OfertaLaboral idOferta) throws Exception {
		return daoOferta.listtarAreasIn(idOferta);
	}
	
	/**
	 *  metodo que listala ciudad de interes por medio de la consulta
	 * @param idOf  el objeto que recibe la consulta para hacer la busqueda
	 * @return lista la ciudad  encontrada
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudadOf(OfertaLaboral idOf) throws Exception {
		
		return daoOferta.listarCiudadOf(idOf);
	}

	public List<OfertaLaboral> listaOferta() throws Exception {
		return daoOferta.listaOferta();
	}
	
	
	/**
	 * metodo que lista las empresas creadas
	 * 
	 * @return las empresas creadas
	 * @throws Exception
	 */
	public List<Empresa> listaEmpresa() throws Exception {
		return daoOferta.listaEmpresa();
	}

	
}
