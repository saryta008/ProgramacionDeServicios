
package programacionServiciosYprocesos;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class PruebaComprobar {
public static void main (String [] args){
	File directorio = new File("C:\\Users\\Usuario\\eclipse-workspace\\programacionServiciosYprocesos\\bin");
	ProcessBuilder p = new ProcessBuilder("java", "programacionServiciosYprocesos.Prueba", "HOLA");
	p.directory(directorio);
	Process x = null;
	try {
	x = p.start();
	}catch(IOException e) {
		System.out.println("El proceso no ha podido inciarse");
	}
	int c;
		InputStream in = x.getInputStream();
		try {
		while ((c=in.read())!=-1) {
			System.out.print((char)c);
		}
		}catch(IOException ex) {
			System.out.println("Error de lectura");
		}
		int exitVal;
		try {
			exitVal = x.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
}
}
