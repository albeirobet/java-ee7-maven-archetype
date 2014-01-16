package com.ascuntar.test.controllers;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import com.ascuntar.test.bo.PruebaBO;
import com.ascuntar.test.commons.web.WebMessages;
import com.ascuntar.test.configuration.language.ConfigurationLanguage;
import com.ascuntar.test.entities.Prueba;


/*
 * @author Eyder Albeiro Ascuntar Rosales
 * @email  eaar23@gmail.com
 * @date   16-01-2014
 */

@Named
@SessionScoped
public class PruebaBean implements Serializable {

	private static final long serialVersionUID = 6437541572047498821L;
	@Inject
	private PruebaBO pruebaBO;
	
	@Inject
	private WebMessages msjWeb;

	private String firstname;
	
	@Inject
	private ConfigurationLanguage configurationLanguage;

	private String surname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void savePerson(ActionEvent actionEvent) {
		Prueba pr = new Prueba(firstname, surname);
		if (pruebaBO.pruebaBO(pr) == true) {
			String bienv= configurationLanguage.getMsjFromProperties("internationalization.web_module", "bienvenido");
			msjWeb.msjWebInformacion(bienv +" "+firstname+ "  "+surname, bienv +" "+firstname+ "  "+surname);
		} else {
			String err=configurationLanguage.getMsjFromProperties("internationalization.web_module", "error_registro");
			msjWeb.msjWebError(err, err);
		}
	}
	

}
