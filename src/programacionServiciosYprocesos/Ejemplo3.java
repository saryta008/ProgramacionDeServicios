package programacionServiciosYprocesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Ejemplo3 {
public static void main (String [] Args) throws IOException {
	File directorio = new File(".\\bin");
	
	ProcessBuilder pb = new ProcessBuilder("java", "programacionServiciosYprocesos.Ejemplo2");
	
	pb.directory(directorio);
	System.out.printf("Directorio de trabajo: %s%n", pb.directory());
	
	Process p = pb.start();
	
	try {
		InputStream lectura = p.getInputStream();
		int c; 
		while ((c = lectura.read()) != -1) {
			System.out.print((char) c);
		}
		lectura.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
