package com.ascuntar.test.ejbs;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;


@Singleton
@Startup
public class PruebaEjb {
	
	public PruebaEjb() {
		System.out.println(" ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Entre al PruebaEjb");
	}
	
	@PostConstruct
	public void funcionInicio(){
		System.out.println(" ->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Entre a la funcion de Inicio");
	}

}
