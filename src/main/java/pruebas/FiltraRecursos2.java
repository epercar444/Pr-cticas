package pruebas;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import step1.*;
import pruebas.*;

public class FiltraRecursos2 {
	final static String rutaDirectorio = "C:\\Users\\epercar444\\Desktop\\eclipse-workspace\\NacexE\\src\\main\\resources";
	final static String rutaWeb = "C:\\Users\\epercar444\\Desktop\\eclipse-workspace\\NacexE\\src\\main\\resources";
	public static void main(String[] args) {
		FiltraFicheroOrigen o = new FiltraFicheroOrigen();
		FiltraRecursos2 m = new FiltraRecursos2();
		System.out.println(m.buscaPorNombre(rutaDirectorio,"nacexShop"));
		//List<String> nombres = m.buscaPorNombre();
		//FiltraFicheroIdiomas n = new FiltraFicheroIdiomas();
		//System.out.println(n.filtraFicheroIdiomas(nombres.get(0)));
	}
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
