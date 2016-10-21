package co.edu.eam.disenosoft.egresado.vista.controlador;

import co.edu.eam.disenosoft.egresado.logica.bos.BOAreaInteres;
import co.edu.eam.disenosoft.egresado.logica.bos.BOFacultad;
import co.edu.eam.disenosoft.egresado.logica.bos.BOPrograma;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;

public class ControladorAdministrarParametrica {

	private BOFacultad boFacultad;
	private BOPrograma boPrograma;
	private BOAreaInteres boAreaInteres;
	
	public ControladorAdministrarParametrica(){
		boFacultad = new BOFacultad();
		boPrograma = new BOPrograma();
		boAreaInteres = new BOAreaInteres();
	}
	
	//Llama al bo crear facultad
	public void crearFacultad(Facultad fac) throws Exception {
		boFacultad.crearFacultad(fac);
	}
	
	//Llama al bo editar facultad
	public void editarFacultad(Facultad fac) throws Exception {
		boFacultad.editarFacultad(fac);
	}
	
	//Llama al bo buscar facultad
	public Facultad buscarFacultad(int idFac) throws Exception {
		return boFacultad.buscarFacultad(idFac);
	}
	
	//Llama al bo crear programa 
	public void crearPrograma (Programa prog) throws Exception{
		boPrograma.crearPrograma(prog);
	}
	
	//Llama al bo editar programa
	public void editarPrograma(Programa prog) throws Exception {
		boPrograma.editarPrograma(prog);
	}
	
	//Llama al bo crear area interes
	public void crearAreaInteres(AreaInteres area) throws Exception {
		boAreaInteres.crearAreaInteres(area);
	}
	
	//Llama al bo editar area interes
	public void editarAreaInteres(AreaInteres area) throws Exception {
		boAreaInteres.editarAreaInteres(area);
		
	}

	public AreaInteres buscarArea(int codigo) throws Exception {
		return boAreaInteres.buscarAreaInteres(codigo);
	}
}
