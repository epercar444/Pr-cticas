package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Recurso {
	private String nombreRecurso; 
	private List<String >idiomas;
	private List<Properties> propiedades;
	

	public Recurso(String rutaCarpeta, String ficheroOrigen) {
		super();
		this.nombreRecurso = ficheroOrigen;
		this.idiomas = new ArrayList<String>();
		this.propiedades = new ArrayList<Properties>();
		
	}
	


}
