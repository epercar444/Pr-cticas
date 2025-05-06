package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

public class Recurso {
	private String nombreRecurso; 
	private Locale idioma;
	private List<String >idiomas;
	private List<Properties> propiedades;
	

	public Recurso(String rutaCarpeta, String ficheroOrigen) {
		super();
		this.nombreRecurso = ficheroOrigen;
		this.idioma = idioma.getDefault();
		this.idiomas = new ArrayList<String>();
		this.propiedades = new ArrayList<Properties>();
		
	}
	


}
