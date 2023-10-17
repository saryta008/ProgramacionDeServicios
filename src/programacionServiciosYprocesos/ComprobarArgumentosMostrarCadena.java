package programacionServiciosYprocesos;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ComprobarArgumentosMostrarCadena {
	public static void main(String[] args) throws IOException {
		File directorio = new File(
				"C:\\Users\\Usuario\\eclipse-workspace\\programacionServiciosYprocesos\\bin");

		ProcessBuilder proceso = new ProcessBuilder("java", "programacionServiciosYprocesos.MostrarCadena", "El verano se acaba");

		proceso.directory(directorio);

		Process p = proceso.start();

		try {
			
			InputStream x = p.getInputStream();
			int c;
				
			while ((c = x.read()) != -1) {
				System.out.print((char) c);
			}
			x.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
