package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;

public class ControladorReportes {

	private BOInformacionLaboral boInfoLab;
	private BOOfertaLaboral boOfertaLab;
	
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
