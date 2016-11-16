package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOAplicarOferta;
import co.edu.eam.disenosoft.egresado.logica.bos.BOAreaInteres;
import co.edu.eam.disenosoft.egresado.logica.bos.BOCiudad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEgresado;
import co.edu.eam.disenosoft.egresado.logica.bos.BOEmpresa;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionAcademica;
import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Ciudad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionAcademica;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaAplicadaEgresado;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.SectorLaboral;

/**
 * Controlador Egresado en el cual se hace uso de los BO 
 * @author CAMILO
 *
 */
public class ControladorAdministrarEgresado {

	/**
	 * se llama los bo de cada una de las entidades
	 */
	
	private BOEgresado boEgresado;
	private BOPrograma boPrograma;
	private BOInformacionAcademica boInfoAc;
	private BOInformacionLaboral boInfoLab;
	private BOOfertaLaboral boOfertaLab;
	private BOAreaInteres boAreaInteres;
	private BOCiudad boCiudad;
	private BOEmpresa boEmpresa;
	private BOAplicarOferta boAplicarOferta;
	
	/**
	 * constructor de la clase
	 */
	public ControladorAdministrarEgresado() {
		boEgresado = new BOEgresado();
		boPrograma = new BOPrograma();
		boInfoAc = new BOInformacionAcademica();
		boInfoLab = new BOInformacionLaboral();
		boOfertaLab = new BOOfertaLaboral();
		boAreaInteres = new BOAreaInteres();
		boCiudad = new BOCiudad();
		boEmpresa = new BOEmpresa();
		boAplicarOferta = new BOAplicarOferta();
	}

	/**
	 * Llama al BOEgresado para Crear un registro egresado
	 * @param egresado Objeto egresado que recibe
	 * @throws Exception
	 */
	public void crearEgresado(Egresado egresado) throws Exception {
		boEgresado.crearEgresado(egresado);
	}

	/**
	 * Llama al BOEgresado para Editar un registro egresado
	 * @param egresado Objeto egresado que recibe
	 * @throws Exception
	 */
	public void editarEgresado(Egresado egresado) throws Exception {
		boEgresado.editarEgresado(egresado);
	}
	
	/**
	 * metodo que busca un programa 
	 * @param id objeto por el cual se busca el prorama
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Programa buscarPrograma(int id) throws Exception {
		return boPrograma.buscarPrograma(id);
	}
	
	/**
	 * Busca un egresado
	 * @param idEgresado objeto por el cual se hace la busqueda 
	 * @return la busqueda desde su respectivo bo
	 */
	public Egresado buscarEgresado(int idEgresado) {
		return boEgresado.buscarEgresado(idEgresado);
	}	
	
	/**
	 * Llama al boInfoAc para crear un registro de informacion academica
	 * @param informacionAc
	 * @throws Exception
	 */
	public void crearInformacionAcademica(InformacionAcademica informacionAc) throws Exception {
		boInfoAc.crearInformacionAcademica(informacionAc);
	}
	
	/**
	 * metodo que busca desde el bo de la informacion academica
	 * @param egre objeto por el cual se va a buscar inf academica
	 * @return la busqueda desde su respectivo bo
	 */
	public InformacionAcademica buscarInformacionAcademica(int egre) {
		return boInfoAc.buscarInformacionAcademica(egre);
	}
	
	/**
	 * metodo que edita desde el bo la informacion academica
	 * @param informacionAcademica objeto por el cual se va a editar la inf academica
	 * @throws Exception
	 */
	public void editarInformacionAcademica(InformacionAcademica informacionAcademica) throws Exception {
		boInfoAc.editarInformacionAcademica(informacionAcademica);
	}
	
	/**
	 * lista las faacultades que hay registradas
	 * @return la lista de las facultades por medio de su respectivo bo
	 * @throws Exception
	 */
	public List<Facultad> listaFacultades() throws Exception {
		return boInfoAc.listaFacultades();
	}
	
	/**
	 * lista los programas que hay registrados
	 * @return la lista de los programas por medio de su respectivo
	 * @throws Exception 
	 */
	public List<Programa> listaProgramas() throws Exception{
		return boInfoAc.listaProgramas();
	}
	
	/**
	 * metodo que crea una informacion laboral por medio de su respectivo bo
	 * @param infoLab objeto por el cual se va a creaer la informacion laboral
	 * @throws Exception
	 */
	public void crearInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		boInfoLab.crearInformacionLaboral(infoLab);
	}
	
	/**
	 * lista los sectores laborales ya creados
	 * @return la lista de los sectores por medio de su respectivo bo
	 * @throws Exception
	 */
	public List<SectorLaboral> listaLaboral() throws Exception {
		return boInfoLab.listaLaboral();
	}
	
	/**
	 * edota una informacion laboral ya creada por medio de su respectivo bo
	 * @param infoLab objeto por el cual se va a editar la informacion laboral 
	 * @throws Exception
	 */
	public void editarInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		boInfoLab.editarInformacionLaboral(infoLab);
	}
	/**
	 * metodo que busca una informacion laboral por medio de su respectivo bo
	 * @param id objeto por el cual se va hacer la busqueda
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public InformacionLaboral buscarInformacionLaboral(int id) throws Exception {
		return boInfoLab.buscarInformacionLaboral(id);
	}
	/**
	 * lista las ofertas laborales
	 * @return las listas laborales por medio de su respectivo bo
	 * @throws Exception
	 */
	public List<OfertaLaboral> listaOferta() throws Exception {
		return boOfertaLab.listaOferta();
	}
	
	/**
	 * metodo que busca una oferta 
	 * @param idOferta objeto por el cual se va hacer la busqueda
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public OfertaLaboral buscarOferta(int idOferta) throws Exception {
		return boOfertaLab.buscarOferta(idOferta);
	}
	
	/**
	 * metodo que busca una area de interes
	 * @param id objeto por el cual se va a realizar la busqueda
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public AreaInteres buscarArea (int id) throws Exception{
		return boAreaInteres.buscarAreaInteres(id);
	}
	
	/**
	 * metodo que busca una ciudad 
	 * @param idCiu objeto por el cual se va hacer la busqueda
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Ciudad buscarCiudad (int idCiu) throws Exception{
		return boCiudad.buscarCiudad(idCiu);
	}
	
	/**
	 * metodo que busca una empresa
	 * @param idEmp objeto por el cual se va a buscar la emoresa
	 * @return la busqueda desde su respectivo bo
	 * @throws Exception
	 */
	public Empresa buscarEmpresa (int idEmp) throws Exception{
		return boEmpresa.buscarEmpresa(idEmp);
	}
	
	/**
	 * metodo por el cual se va aplicar una oferta por medio de su bo
	 * @param aplicarOfer objeto por el cual se va a aplicar la  oferta
	 * @throws Exception
	 */
	public void aplicarOferta(OfertaAplicadaEgresado aplicarOfer) throws Exception {
		boAplicarOferta.aplicarOferta(aplicarOfer);
	}
	
	/**
	 * Lista de programas
	 * @return lista de programas
	 * @throws Exception
	 */
	public List<Programa> listaPrograma () throws Exception{
		return boPrograma.listaPrograma();
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Empresa> listaEmpresa() throws Exception{
		return boOfertaLab.listaEmpresa();
	}
}
