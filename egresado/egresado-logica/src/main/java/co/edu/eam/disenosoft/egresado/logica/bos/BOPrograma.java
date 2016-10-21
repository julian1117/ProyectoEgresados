package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Programa;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOProgramaJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos para
 * crear programa, editar programa y bucar programa
 * 
 * @author CAMILO
 *
 */
public class BOPrograma {

	/**
	 * Llamo al dao de la entidad programa
	 */
	private DAOProgramaJPA daoPrograma;

	public BOPrograma() {
		daoPrograma = new DAOProgramaJPA();
	}

	/**
	 * crea un programa
	 * @param prog
	 * @throws Exception
	 */
	public void crearPrograma(Programa prog) throws Exception {

		Programa pro = daoPrograma.buscarPrograma(prog.getIdPrograma());

		if (pro == null) {
			daoPrograma.crearPrograma(prog);
		} else {
			throw new ExcepcionNegocio("El programa ya existe");
		}

	}

	/**
	 * edita un programa
	 * @param prog
	 * @throws Exception
	 */
	public void editarPrograma(Programa prog) throws Exception {
		Programa pro = daoPrograma.buscarPrograma(prog.getIdPrograma());

		if (pro != null) {
			daoPrograma.editarPrograma(prog);
		} else {
			throw new ExcepcionNegocio("El programa no existe");
		}
	}

	/**
	 * Busca un programa
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Programa buscarPrograma(int id) throws Exception {
		Programa pro = daoPrograma.buscarPrograma(id);
		if(pro!=null ){
			return pro;
		}else{
			throw new ExcepcionNegocio("El programa academico no existe");
		}

	}
	
	
}
