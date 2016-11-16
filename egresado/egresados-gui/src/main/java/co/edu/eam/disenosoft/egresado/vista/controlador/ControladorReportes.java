package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;

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
	
	/**
	 * constructor de la clase
	 */
	public ControladorReportes() {
		boInfoLab = new BOInformacionLaboral();
		boOfertaLab = new BOOfertaLaboral();
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
}
