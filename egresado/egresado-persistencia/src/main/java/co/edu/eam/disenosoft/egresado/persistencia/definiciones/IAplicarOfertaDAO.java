package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaAplicadaEgresado;

/**
 * clase para declarar los metodos para la aplicacion de la oferta
 * @author laura posada
 * 16/11/2016
 */
public interface IAplicarOfertaDAO {
	
	/**
	 * implememntacion del metodo para aplicar a una oferta
	 * @param aplicarOfer objeto que recibe para aplicar a una oferta
	 * @throws Exception
	 */
	public void aplicarOferta (OfertaAplicadaEgresado aplicarOfer) throws Exception;
	
	public OfertaAplicadaEgresado buscarOfertaAplicada (OfertaAplicadaEgresado id) throws Exception;
}
