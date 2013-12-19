package com.ascuntar.test.dao;

import javax.ejb.Local;

import com.ascuntar.test.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaDAO {

	public boolean pruebaDAO(Prueba pr);

}
