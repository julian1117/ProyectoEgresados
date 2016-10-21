package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;

public interface IFacultadDAO {

	//Crear una facultad
	public void crearFacultad (Facultad fac) throws Exception;	
	
	//Editar una facultad
	public void editarFacultad (Facultad fac) throws Exception;
	
	//Busca una facultad
	public Facultad buscarFacultad (int idFac) throws Exception;
	
}
