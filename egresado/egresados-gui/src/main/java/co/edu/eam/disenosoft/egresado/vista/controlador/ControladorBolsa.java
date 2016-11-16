package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOAreaInteres;
import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;

/**
 * Controlador bolsa en el cual se hace uso de los BO 
 * @author laura posada
 *
 */
public class ControladorBolsa {
	
	/**
	 * se llama los bo de cada una de las entidades
	 */
	private BOOfertaLaboral boOfertaLaboral;
	private BOAreaInteres boAreaInteres;
	private BOCiudad boCiudad;
	private BOPrograma boPrograma;
	
	/**
	 * constructor de la clase
	 */
	public ControladorBolsa() {
		boOfertaLaboral = new BOOfertaLaboral();
		boAreaInteres= new BOAreaInteres();
		boCiudad = new BOCiudad();
		boPrograma = new BOPrograma();
	}
	
	/**
	 * metodo que crea una oferta laboral por medio de su bo
	 * @param ofertaLa objeto por el cual se va a crear la oferta
	 * @throws Exception
	 */
	public void crearOfertaLaboral (OfertaLaboral ofertaLa) throws Exception{
		boOfertaLaboral.crearOfertaLaboral(ofertaLa);
	}
	/**
	 * lista las areas de interes
	 * @return las areas de interes por medio de su bo
	 * @throws Exception
	 */
	public List<AreaInteres> listarAreas() throws Exception {
		List<AreaInteres> are = boAreaInteres.listarAreas();
		return are;
	}
	/**
	 * busca una area de interes 
	 * @param area objeto por el cual se va a buscar una area 
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public AreaInteres buscarIdArea (int area) throws Exception{
		return boAreaInteres.buscarAreaInteres(area);
	}
	
	/**
	 * metodo que lista ciudades
	 * @return las ciudades por medio del bo
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudad() throws Exception {
		return boCiudad.listarCiudad();
	}
	
	/**
	 * busca ciudades 
	 * @param ciudad objeto por el cual se va hacer la busqueda
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Ciudad buscarCiudad(int ciudad) throws Exception{
		return boCiudad.buscarCiudad(ciudad);
	}
	
	/**
	 * metodo que busca una empresa 
	 * @param idEm objeto por el cual se va hacer la busqueda
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Empresa buscarEmpresa (int idEm) throws Exception{
		return boOfertaLaboral.buscarEmpresa(idEm);
	}
	
	/**
	 * metodo que busca una oferta laboral
	 * @param idOferta objeto por el cual se va hacer la busqueda 			
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public OfertaLaboral buscarOferta(int idOferta) throws Exception {
		return boOfertaLaboral.buscarOferta(idOferta);
	}
	
	/**
	 * metodo que edita una oferta laboral 
	 * @param idOferta objeto por el cual se edita la oferta
	 * @throws Exception
	 */
	public void editarOferta (OfertaLaboral Oferta) throws Exception{
		boOfertaLaboral.editarOferta(Oferta);
	}
	
	/**
	 * 
	 * @param idOferta
	 * @return
	 * @throws Exception
	 */
	public List<AreaInteres> listtarAreasIn(OfertaLaboral idOferta) throws Exception {
		return boOfertaLaboral.listtarAreasIn(idOferta);
				}

	/**
	 * 
	 * @param idOf
	 * @return
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudadOf(OfertaLaboral idOf) throws Exception {
		return boOfertaLaboral.listarCiudadOf(idOf);
	}
	
	
	/**
	 * llama al BOOferta para hacer la busqueda de una
	 * empresa creada
	 * @return la empresa buscada
	 * @throws Exception
	 */
	public List<Empresa> listaEmpresa() throws Exception {
		return boOfertaLaboral.listaEmpresa();
	}

	/**
	 * Lista de programas
	 * @return lista de programas
	 * @throws Exception
	 */
	public List<Programa> listaPrograma () throws Exception{
		return boPrograma.listaPrograma();
	}
		


}
