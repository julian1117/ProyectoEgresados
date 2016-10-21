package co.edu.eam.disenosoft.egresado.persistencia.definiciones;

import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaAplicadaEgresado;

public interface IAplicarOfertaDAO {
	
	public void aplicarOferta (OfertaAplicadaEgresado aplicarOfer) throws Exception;
	
//	public OfertaAplicadaEgresado buscarOfertaAplicada (int id) throws Exception;
}
