package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOAreaInteresJPA;
/**
 * Clase encargada de hacer validacione necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * 
 * @author CAMILO
 *
 */
public class BOAreaInteres {

	/**
	 * se llama el dao de la entidad AreaInteres
	 */
	private DAOAreaInteresJPA daoAreaInteres;
	
	/**
	 * costructor de la clase
	 */
	public BOAreaInteres(){
		daoAreaInteres = new DAOAreaInteresJPA();
	}
	
	/**
	 * crea una area de interes
	 * @param area objeto por el cual se va a crear el area 
	 * @throws Exception que el area de interes ya haya sido creaada
	 */
	public void crearAreaInteres(AreaInteres area) throws Exception {
		
		AreaInteres areaIn = daoAreaInteres.buscarAreaInteres(area.getIdArea());
		
		if(areaIn == null){
			daoAreaInteres.crearAreaInteres(area);
		}else{
			throw new ExcepcionNegocio("EL area de interes ya esta registrada");
		}		
	}
	
	/**
	 * edita una area de interes ya creada
	 * @param area objeto por el cual se va a editar el area
	 * @throws Exception el area de interes a editar no se encuentre registrada
	 */
	public void editarAreaInteres(AreaInteres area) throws Exception {
		AreaInteres areaIn = daoAreaInteres.buscarAreaInteres(area.getIdArea());
		
		if(areaIn != null){
			daoAreaInteres.editarAreaInteres(area);
		}else{
			throw new ExcepcionNegocio("El area de interes no existe");
		}
	}
	
	/**
	 * busca una area de interes
	 * @param id objeto por el cual se va a bscar el area de interes
	 * @return la busqueda del area de interes
	 * @throws Exception
	 */
	public AreaInteres buscarAreaInteres(int id) throws Exception{
		return daoAreaInteres.buscarAreaInteres(id);
	}
	
	/**
	 * metodo que lista las areas de interes de la clase DAOAreaInteresJPA
	 * @return las areas de ineters que se encuentran registradas
	 * @throws Exception
	 */
	public List<AreaInteres> listarAreas() throws Exception {
		List<AreaInteres> are = daoAreaInteres.listarAreas();
		return are;
	}
	
		
}
