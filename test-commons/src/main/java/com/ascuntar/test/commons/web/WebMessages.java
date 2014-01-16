package com.ascuntar.test.commons.web;

import java.io.Serializable;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
/*
 * Clase creada para declarar funciones comunes en la capa web
 * con respecto a los mensajes mostrados en las paginas xhtml  
 */

public class WebMessages implements Serializable {

	private static final long serialVersionUID = -2440664025110664270L;

	/*
	 * Recibe como parametro una cadena de tipo String y devuelve un Mensaje
	 * para mostrar en las etiquedas <p:messages/>
	 */

	
	public void msjWebBasico(String mensaje) {
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(mensaje));
	}
	
	public void msjWebInformacion(String titulo, String subtitulo){
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, titulo, subtitulo));
	}
	
	public void msjWebAdvertencia(String titulo, String subtitulo){
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_WARN, titulo, subtitulo));
	}
	
	public void msjWebError(String titulo, String subtitulo){
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR, titulo, subtitulo));
	}
	
	public void msjWebFatal(String titulo, String subtitulo){
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL, titulo, subtitulo));
	}
	
	
}