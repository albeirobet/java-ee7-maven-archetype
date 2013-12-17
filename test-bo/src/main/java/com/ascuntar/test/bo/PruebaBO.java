package com.ascuntar.test.bo;

import javax.ejb.Local;

import com.ascuntar.test.entities.Prueba;

@Local
public interface PruebaBO {

	public boolean pruebaBO (Prueba pr);
	
}
