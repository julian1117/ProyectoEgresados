package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import java.util.List;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
/**
 * clase donde se declaran los metodos para una oferta laboral
 * @author laura posada
 * 16/11/2016
 */
public interface IOfertaLaboral {
	/**
	 * implementacion del metodo para crear una oferta laborarl
	 * @param ofertaLa objeto que recibe el metodo para poder ser
	 * creado
	 * @throws Exception que se puede efectuar
	 */
	public void crearOfertaLaboral (OfertaLaboral ofertaLa) throws Exception;

	/**
	 * implementacion del metodo para buscar una empresa ya creada
	 * @param idEm objeto que recibe la busqueda por el cual
	 * se buscara
	 * @return los datod de la empresa buscada
	 * @throws Exception que se puede efectuar
	 */
	public Empresa buscarEmpresa (int idEm) throws Exception;
	
	/**
	 *implementacion del metodo para buscar una oferta
	 *laboral ya creada
	 * @param idOferta  objeto que recibe la busqueda por el cual va a ser
	 * buscada la oferta
	 * @throws Exception que se puede efectuar 
	 */
	public OfertaLaboral buscarOferta(int idOferta) throws Exception;
	
	
	/**
	 * implementacion del metodo para editar una oferta
	 * @param idOferta objeto por el cual va a ser editado 
	 * @throws Exception
	 */
	public void editarOferta (OfertaLaboral Oferta) throws Exception;
	
	/**
	 * implementacion del metodo para listar las areas de interes en 
	 * una oferta creada
	 * @param idOferta objeto que recibe el metodo para buscar las areas de interes
	 * de la oferta
	 * @return areas de interes encontradas
	 * @throws Exception
	 */
	public List<AreaInteres> listtarAreasIn(OfertaLaboral idOferta) throws Exception;
	
	/**
	 * implementacion del metdodo para listar la cuidad en la cuak
	 * se encuentra la oferta creada
	 * @param idOf objeto que recibe el metodo para buscar la ciudad de la oferta 
	 * @return
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudadOf(OfertaLaboral idOf) throws Exception;
	
	/**
	 * implementacion del metodo listar una oferta laboral
	 * @return los datos de la oferta laboal
	 * @throws Exception
	 */
	public List<OfertaLaboral> listaOferta () throws Exception;
	
	/**
	 * implementacion del metodo para listar las empresas creadas
	 * @return las empresas encontradas
	 * @throws Exception
	 */
	public List<Empresa> listaEmpresa() throws Exception;
	
	/**
	 * Lista de ofertas por programa academico
	 * @return lista de programas
	 * @throws Exception
	 */
	public List<OfertaLaboral> listaOfertaPrograma(Programa programa) throws Exception;
}
