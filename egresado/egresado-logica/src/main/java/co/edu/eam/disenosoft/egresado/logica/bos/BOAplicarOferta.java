package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaAplicadaEgresado;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOAplicarOfertaJPA;

/**
 * Clase encarga de hacer las validaciones necesarias para el correcto
 * funcionamiento de la aplicacion durante la ejecucion de los metodos 
 * @author laura posada
 *
 */
public class BOAplicarOferta {

	/**
	 * se llama el dao de la oferta
	 */
	private DAOAplicarOfertaJPA daoOferta;

	/**
	 * orconstructr
	 */
	public BOAplicarOferta() {
		daoOferta = new DAOAplicarOfertaJPA();
	}

	/**
	 * aplica una oferta
	 * @param aplicarOfer objeto por el cual se va  a plicar la oferta
	 * @throws Exception que el usuario ya haya generado una oferta
	 */
	public void aplicarOferta(OfertaAplicadaEgresado aplicarOfer) throws Exception {

//		OfertaAplicadaEgresado oferta = daoOferta.buscarOfertaAplicada(aplicarOfer.getEgresado().getId());
//
//		if (oferta.getEgresado().getId() != aplicarOfer.getEgresado().getId()
//				&& oferta.getOfertaLaboral().getIdOferta() != aplicarOfer.getOfertaLaboral().getIdOferta()) {
			daoOferta.aplicarOferta(aplicarOfer);
//		} else {
//			throw new ExcepcionNegocio("Usted ya aplico a esta oferta");
//		}

	}

}
