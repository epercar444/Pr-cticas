package url;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FiltraFichero {
	private static final String expRegular = ".*_[a-zA-Z]{2}.properties";
	final static String rutaDirectorio = "C:\\Users\\epercar444\\Desktop\\eclipse-workspace\\NacexE\\src\\main\\resources";

	public static void main(String[] args) {
		FiltraFichero r = new FiltraFichero();
		List<File> ficherosOrigen = r.filtraFicheroOrigen();
		System.out.println(ficherosOrigen);
		for (File f : ficherosOrigen) {
			int index = f.getName().indexOf(".properties");
			String nombre = f.getName().substring(0,index);
			List<String> idiomas = r.FiltraIdioma(nombre);
			System.out.println(idiomas);
		}
	}

	public List<File> filtraFicheroOrigen() {
		List<File> ficheros = new ArrayList<File>();
		File directorio = new File(rutaDirectorio);
		for (File f : directorio.listFiles()) {
			if (!f.getName().matches(expRegular)) {
				ficheros.add(f);
			}
		}
		return ficheros;
	}

	public List<File> filtraFicheroIdiomas(String directorio1) {
		List<File> idiomas = new ArrayList<File>();
		File directorio = new File(rutaDirectorio);
		for (File f : directorio.listFiles()) {
			if (f.getName().matches(directorio1 + expRegular)) {
				idiomas.add(f);
			}
		}
		return idiomas;
	}

	/**
	 * FiltraIdioma: 
	 * @author epercar444
	 * @param directorio1
	 * @param
	 * @return
	 */
	public List<String> FiltraIdioma(String directorio1) {
		List<String> listaIdioma = new ArrayList<String>();
		List<File> idiomas = filtraFicheroIdiomas(directorio1);
		for (File f : idiomas) {
			String nombreFichero = f.getName();
			int index = nombreFichero.indexOf(".properties");
			if (nombreFichero.split("_").length > 2) {
				listaIdioma.add(nombreFichero.substring(index - 4, index));
			}
			else {
				listaIdioma.add(nombreFichero.substring(index - 2, index));
			}
		}
		return listaIdioma;
	}
}