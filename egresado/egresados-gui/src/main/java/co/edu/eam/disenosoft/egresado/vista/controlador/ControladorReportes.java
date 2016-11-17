package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Empresa;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;

/**
 * Controlador reportes en el cual se hace uso de los BO 
 * @author laura posada
 *
 */
public class ControladorReportes {

	/**
	 * se llama los bo de cada una de las entidades
	 */
	private BOInformacionLaboral boInfoLab;
	private BOOfertaLaboral boOfertaLab;
	private BOPrograma boPrograma;
	
	/**
	 * constructor de la clase
	 */
	public ControladorReportes() {
		boInfoLab = new BOInformacionLaboral();
		boOfertaLab = new BOOfertaLaboral();
		boPrograma = new BOPrograma();
	}

	/**
	 * Lista de informacion laboral
	 * @return lista con informaicon laboral
	 * @throws Exception
	 */
	public List<InformacionLaboral> listaInfomracionLaboral() throws Exception {
		return boInfoLab.listaInfomracionLaboral();
	}
	
	/**
	 * Lista de las oferta laborales en la BD
	 * @return lista de ofertas
	 * @throws Exception
	 */
	public List<OfertaLaboral> listaOfertaLab() throws Exception{
		return boOfertaLab.listaOferta();
	}
	
	/**
	 * Lista de programas
	 * @return lista con los programas
	 * @throws Exception
	 */
	public List<Programa> listaPrograma () throws Exception{
		return boPrograma.listaPrograma();
	}
	
	/**
	 * Lista de informacion labral  por programa
	 * @param programa programa que recibe
	 * @return lista de informaicon laboral
	 * @throws Exception
	 */
	public List<InformacionLaboral> listaInfomracionLaboralPrograma(Programa programa) throws Exception {
		return boInfoLab.listaInfomracionLaboralPrograma(programa);
	}
	
	/**
	 * Lista de oferta laborales por programa academico
	 * @param programa academico que recibe
	 * @return lista de ofertas laborales
	 * @throws Exception
	 */
	public List<OfertaLaboral> listaOfertaPrograma(Programa programa) throws Exception {
		return boOfertaLab.listaOfertaPrograma(programa);
	}
	
	/**
	 * Lista de empresas
	 * @return lista de las empresas
	 * @throws Exception
	 */
	public List<Empresa> listaEmpresa () throws Exception{
		return boOfertaLab.listaEmpresa();
	}
	
	
	/**
	 * lista informacion laborla por empresa
	 * @param empresa objeto que recibe
	 * @return la lista de la informacion laboral buscada por empresa
	 * @throws Exception
	 */
	public List<InformacionLaboral> listaInformacionLabEmpresa(Empresa empresa) throws Exception {
		return boInfoLab.listaInformacionLabEmpresa(empresa);
	}
}
