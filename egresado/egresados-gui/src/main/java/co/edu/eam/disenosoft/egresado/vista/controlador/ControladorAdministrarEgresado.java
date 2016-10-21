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
 * Controlador Egresado
 * @author CAMILO
 *
 */
public class ControladorAdministrarEgresado {

	private BOEgresado boEgresado;
	private BOPrograma boPrograma;
	private BOInformacionAcademica boInfoAc;
	private BOInformacionLaboral boInfoLab;
	private BOOfertaLaboral boOfertaLab;
	private BOAreaInteres boAreaInteres;
	private BOCiudad boCiudad;
	private BOEmpresa boEmpresa;
	private BOAplicarOferta boAplicarOferta;
	
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
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Programa buscarPrograma(int id) throws Exception {
		return boPrograma.buscarPrograma(id);
	}
	
	/**
	 * Busca un egresado
	 * @param idEgresado
	 * @return
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
	
	public InformacionAcademica buscarInformacionAcademica(int egre) {
		return boInfoAc.buscarInformacionAcademica(egre);
	}
	
	
	public void editarInformacionAcademica(InformacionAcademica informacionAcademica) throws Exception {
		boInfoAc.editarInformacionAcademica(informacionAcademica);
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Facultad> listaFacultades() throws Exception {
		return boInfoAc.listaFacultades();
	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Programa> listaProgramas() throws Exception{
		return boInfoAc.listaProgramas();
	}
	
	/**
	 * 
	 * @param infoLab
	 * @throws Exception
	 */
	public void crearInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		boInfoLab.crearInformacionLaboral(infoLab);
	}
	
	
	public List<SectorLaboral> listaLaboral() throws Exception {
		return boInfoLab.listaLaboral();
	}
	
	public void editarInformacionLaboral(InformacionLaboral infoLab) throws Exception {
		boInfoLab.editarInformacionLaboral(infoLab);
	}
	
	public InformacionLaboral buscarInformacionLaboral(int id) throws Exception {
		return boInfoLab.buscarInformacionLaboral(id);
	}
	
	public List<OfertaLaboral> listaOferta() throws Exception {
		return boOfertaLab.listaOferta();
	}
	
	public OfertaLaboral buscarOferta(int idOferta) throws Exception {
		return boOfertaLab.buscarOferta(idOferta);
	}
	
	public AreaInteres buscarArea (int id) throws Exception{
		return boAreaInteres.buscarAreaInteres(id);
	}
	
	public Ciudad buscarCiudad (int idCiu) throws Exception{
		return boCiudad.buscarCiudad(idCiu);
	}
	
	public Empresa buscarEmpresa (int idEmp) throws Exception{
		return boEmpresa.buscarEmpresa(idEmp);
	}
	
	public void aplicarOferta(OfertaAplicadaEgresado aplicarOfer) throws Exception {
		boAplicarOferta.aplicarOferta(aplicarOfer);
	}
}
