package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOAreaInteres;
import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;

public class ControladorBolsa {
	
	private BOOfertaLaboral boOfertaLaboral;
	private BOAreaInteres boAreaInteres;
	private BOCiudad boCiudad;
	
	public ControladorBolsa() {
		boOfertaLaboral = new BOOfertaLaboral();
		boAreaInteres= new BOAreaInteres();
		boCiudad = new BOCiudad();
	}
	
	/**
	 * 
	 * @param ofertaLa
	 * @throws Exception
	 */
	public void crearOfertaLaboral (OfertaLaboral ofertaLa) throws Exception{
		boOfertaLaboral.crearOfertaLaboral(ofertaLa);
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<AreaInteres> listarAreas() throws Exception {
		List<AreaInteres> are = boAreaInteres.listarAreas();
		return are;
	}
	/**
	 * 
	 * @param area
	 * @return
	 * @throws Exception
	 */
	public AreaInteres buscarIdArea (int area) throws Exception{
		return boAreaInteres.buscarAreaInteres(area);
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Ciudad> listarCiudad() throws Exception {
		return boCiudad.listarCiudad();
	}
	
	/**
	 * 
	 * @param ciudad
	 * @return
	 * @throws Exception
	 */
	public Ciudad buscarCiudad(int ciudad) throws Exception{
		return boCiudad.buscarCiudad(ciudad);
	}
	
	/**
	 * 
	 * @param idEm
	 * @return
	 * @throws Exception
	 */
	public Empresa buscarEmpresa (int idEm) throws Exception{
		return boOfertaLaboral.buscarEmpresa(idEm);
	}
	
	/**
	 * 
	 * @param idOferta
	 * @return
	 * @throws Exception
	 */
	public OfertaLaboral buscarOferta(int idOferta) throws Exception {
		return boOfertaLaboral.buscarOferta(idOferta);
	}
	
	/**
	 * 
	 * @param idOferta
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

	

		


}
