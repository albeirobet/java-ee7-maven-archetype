package com.ascuntar.test.dao.impl;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.ascuntar.test.dao.PruebaDAO;
import com.ascuntar.test.entities.Prueba;

public class PruebaDAOImpl implements PruebaDAO, Serializable {

	private static final long serialVersionUID = 9153317466475466077L;
	@PersistenceContext(unitName = "testPU")
	private EntityManager em;

	@Override
	public boolean pruebaDAO(Prueba pr) {
		try {
			em.persist(pr);
			return true;
		} catch (Exception e) {
			System.out.println("Error al persistir el Objeto:  "+e.getMessage());
			return false;
		}
	}

}
