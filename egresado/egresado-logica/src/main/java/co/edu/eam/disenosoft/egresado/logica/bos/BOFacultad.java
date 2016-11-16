package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Facultad;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOFacultadJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BOFacultad {

	/**
	 * se llama el dao de la facultad
	 */
	private DAOFacultadJPA daoFacultad;
	
	/**
	 * constructor de la clase
	 */
	public BOFacultad(){
		daoFacultad = new DAOFacultadJPA();
	}
	
	//Llama  al dao crear facultad
	public void crearFacultad(Facultad fac) throws Exception {
		Facultad facu = daoFacultad.buscarFacultad(fac.getIdFacultad());
		
		if(facu == null){
			daoFacultad.crearFacultad(fac);	
		}else{
			throw new ExcepcionNegocio("La facultad ya esta creada");
		}	
	}
	
	//Llama al dao editar facultad
	public void editarFacultad(Facultad fac) throws Exception {
		Facultad facu = daoFacultad.buscarFacultad(fac.getIdFacultad());
		if(facu != null){
			daoFacultad.editarFacultad(fac);
		}else{
			throw new ExcepcionNegocio("La facultad no esta registrada");
		}
		
	}
	
	//Busca una facultad por un codigo
	public Facultad buscarFacultad(int idFac) throws Exception {
		return daoFacultad.buscarFacultad(idFac);
	}
	
	
}
