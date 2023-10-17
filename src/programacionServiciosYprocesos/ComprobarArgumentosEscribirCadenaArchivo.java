package programacionServiciosYprocesos;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ComprobarArgumentosEscribirCadenaArchivo {
	public static void main (String [] args) throws IOException {
		File directorio = new File("C:\\Users\\Usuario\\eclipse-workspace\\programacionServiciosYprocesos\\bin");
		
		ProcessBuilder proceso= new ProcessBuilder("java", "programacionServiciosYprocesos.EscribirCadenaEnArchivo", "El verano se acaba");
		
		proceso.directory(directorio);
		
		Process p = proceso.start();
		
		try {
			InputStream x = p.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(x);
	        BufferedReader b = new BufferedReader(inputStreamReader);
	        
			File directorioCopia = new File("C:\\Users\\Usuario\\eclipse-workspace\\programacionServiciosYprocesos");
			File archivo = new File(directorioCopia, "archivoCopias.txt");
			archivo.createNewFile();
			
			String linea;
			FileWriter flujoEscritura = new FileWriter(archivo);
			while ((linea = b.readLine()) != null) {
				flujoEscritura.write(linea);
			}
				flujoEscritura.close();
				x.close();
				inputStreamReader.close();
				b.close();
			}catch (Exception e) {
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
