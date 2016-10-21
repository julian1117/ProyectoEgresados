package co.edu.eam.disenosoft.egresado.logica.bos;

import java.util.List;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.AreaInteres;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOAreaInteresJPA;

public class BOAreaInteres {

	private DAOAreaInteresJPA daoAreaInteres;
	
	public BOAreaInteres(){
		daoAreaInteres = new DAOAreaInteresJPA();
	}
	
	
	public void crearAreaInteres(AreaInteres area) throws Exception {
		
		AreaInteres areaIn = daoAreaInteres.buscarAreaInteres(area.getIdArea());
		
		if(areaIn == null){
			daoAreaInteres.crearAreaInteres(area);
		}else{
			throw new ExcepcionNegocio("EL area de interes ya esta registrada");
		}		
	}
	
	public void editarAreaInteres(AreaInteres area) throws Exception {
		AreaInteres areaIn = daoAreaInteres.buscarAreaInteres(area.getIdArea());
		
		if(areaIn != null){
			daoAreaInteres.editarAreaInteres(area);
		}else{
			throw new ExcepcionNegocio("El area de interes no existe");
		}
	}
	
	/**
	 * 
	 * @param id
	 * @return
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
