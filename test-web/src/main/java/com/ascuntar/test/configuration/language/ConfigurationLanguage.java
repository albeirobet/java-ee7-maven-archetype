package com.ascuntar.test.configuration.language;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@Stateless
public class ConfigurationLanguage implements Serializable {
	
	private static final long serialVersionUID = 3783372660998825636L;

	public ConfigurationLanguage() {
	}
	
	/*
	 * Recibe como parametros el nombre del archivo de propiedades del cual se va a extraer
	 * el mensaje y el nombre de la variable del mensaje
	 * Retorna el mensaje en el Idioma que esta definido actualmente por el usuario
	 */
	public String getMsjFromProperties(String nameBundle, String nameVar){
		Locale myRequestLocale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		String bundleQualifierName = nameBundle;
		ResourceBundle resourceBundle = ResourceBundle.getBundle(bundleQualifierName, new Locale(myRequestLocale.getLanguage()));
		return resourceBundle.getString(nameVar);
	}

}
