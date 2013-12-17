package com.ascuntar.test.boimpl;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.ascuntar.test.bo.PruebaBO;
import com.ascuntar.test.dao.PruebaDAO;
import com.ascuntar.test.entities.Prueba;


@Stateless
public class PruebaBOImpl implements PruebaBO, Serializable{

	private static final long serialVersionUID = -4987639425366667404L;
	@Inject
	private PruebaDAO pruebaDAO;
	
	
	@Override
	public boolean pruebaBO(Prueba pr) {
		return pruebaDAO.pruebaDAO(pr);
	}

}
