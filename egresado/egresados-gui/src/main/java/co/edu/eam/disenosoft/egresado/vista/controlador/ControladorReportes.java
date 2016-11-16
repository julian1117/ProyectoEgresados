package co.edu.eam.disenosoft.egresado.vista.controlador;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.bos.BOInformacionLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOOfertaLaboral;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.InformacionLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaLaboral;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;

public class ControladorReportes {

	private BOInformacionLaboral boInfoLab;
	private BOOfertaLaboral boOfertaLab;
	private BOPrograma boPrograma;
	
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
}
