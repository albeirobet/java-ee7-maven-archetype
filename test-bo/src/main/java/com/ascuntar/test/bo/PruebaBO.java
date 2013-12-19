package com.ascuntar.test.bo;

import javax.ejb.Local;
import com.ascuntar.test.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaBO {

	public boolean pruebaBO(Prueba pr);

}
