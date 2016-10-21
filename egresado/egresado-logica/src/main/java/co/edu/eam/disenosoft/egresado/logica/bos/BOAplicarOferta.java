package co.edu.eam.disenosoft.egresado.logica.bos;

import co.edu.eam.disenosoft.egresado.logica.excepcionNegocio.ExcepcionNegocio;
import co.edu.eam.disenosoft.egresado.persistencia.entidades.OfertaAplicadaEgresado;
import co.edu.eam.disenosoft.egresado.persistencia.implementaciones.jpa.DAOAplicarOfertaJPA;

public class BOAplicarOferta {

	private DAOAplicarOfertaJPA daoOferta;

	public BOAplicarOferta() {
		daoOferta = new DAOAplicarOfertaJPA();
	}

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
