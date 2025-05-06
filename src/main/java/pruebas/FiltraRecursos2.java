package pruebas;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import step1.*;
import pruebas.*;

public class FiltraRecursos2 {
	final static String rutaDirectorio = "C:\\Users\\epercar444\\Desktop\\eclipse-workspace\\NacexE\\src\\main\\resources";
	//final static String rutaDirectorio = "C::" + File.separator + "Users" + File.separator + "epercar444" + File.separator + "eclipse-workspace" + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "web2017";
	public static void main(String[] args) {
	FiltraIdioma n = new FiltraIdioma();
	System.out.println(n.FiltraIdioma(rutaDirectorio));
	}
	
}
