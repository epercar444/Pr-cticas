package step2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import step1.FiltraFicheroOrigen;

public class BuscaNombre {
	public String buscaPorNombre (String rutaDirectorio, String nombrefichero) {
		String nombre = "";
		File directorio = new File(rutaDirectorio);
		for (File d : directorio.listFiles()) {
			if (d.equals(nombrefichero))  {
				nombre = d.getName();
				String [] devuelveNombre = nombrefichero.split("\\.");
				String nombres = Arrays.toString(devuelveNombre);
				nombre = devuelveNombre[0];
		}
	}   
		return nombre;
}
}
