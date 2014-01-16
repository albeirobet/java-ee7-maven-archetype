package com.ascuntar.test.configuration.accesscontrol;

import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 * @email  eaar23@gmail.com
 * @date   16-01-2014
 */

@Stateful
public class FacesContextProducer {
	@Produces
	@RequestScoped
	public FacesContext produceFacesContext() {
		return FacesContext.getCurrentInstance();
	}
}
