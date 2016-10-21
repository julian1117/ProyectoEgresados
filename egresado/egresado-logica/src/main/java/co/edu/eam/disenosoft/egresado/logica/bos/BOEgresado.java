package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.Egresado;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOEgresadoJPA;
/**
 * Clase BOEgresado, se encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos para
 * crear, editar y bucar un registro de un egresado
 * @author CAMILO
 *
 */
public class BOEgresado {

	private DAOEgresadoJPA daoEgresado;

	public BOEgresado() {
		daoEgresado = new DAOEgresadoJPA();
	}

	/**
	 * Valida que el egresado no este registrado, si no  esta registrado lo crea
	 * de lo contrario manda un excepcion diciendo que ya esta registrado
	 * @param egresado Objeto egresado que recibe para crear
	 * @throws Exception 
	 */
	public void crearEgresado(Egresado egresado) throws Exception {
		Egresado egre = daoEgresado.buscarEgresado(egresado.getId());

		if (egre == null) {
			daoEgresado.crearEgresado(egresado);
		} else {
			throw new ExcepcionNegocio("El egresado ya existe");
		}
	}

	/**
	 * Valida que el egresado este registrad por su id, si exite el egresado lo edita y 
	 * si no exite manda un excepcion diciendo que el egresado no exite
	 * @param egresado Objeto egresado que recibe para editar
	 * @throws Exception
	 */
	public void editarEgresado(Egresado egresado) throws Exception {
		Egresado egre = daoEgresado.buscarEgresado(egresado.getId());

		if (egre != null) {
			daoEgresado.editarEgresado(egresado);
		} else {
			throw new ExcepcionNegocio("El egresado no existe");
		}
	}
	
	public Egresado buscarEgresado(int idEgresado) {
		return daoEgresado.buscarEgresado(idEgresado);
	}		

}
