package programacionServiciosYprocesos;

import java.io.IOException;
import java.io.InputStream;

public class Ejemplo2 {
public static void main (String [] Args) throws IOException {
	Process p = new ProcessBuilder("CMD","/C","DiR").start(); 
	try {
		InputStream lectura = p.getInputStream();
		int c; 
		while ((c = lectura.read()) != -1) {
			System.out.print((char)c);
		}
			lectura.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	int valor;
	try {
		valor=p.waitFor();
		System.out.print("El valor de salida es: " +valor);
		
	}catch(Exception a) {
		a.printStackTrace();
	}
}
}
