package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;

public class ControladorReportes {

	private BOInformacionLaboral boInfoLab;
	
	public ControladorReportes() {
		boInfoLab = new BOInformacionLaboral();
	}

	/**
	 * Lista de informacion laboral
	 * @return lista con informaicon laboral
	 * @throws Exception
	 */
	public List<InformacionLaboral> listaInfomracionLaboral() throws Exception {
		return boInfoLab.listaInfomracionLaboral();
	}
}
