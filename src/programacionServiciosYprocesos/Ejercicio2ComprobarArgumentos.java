package programacionServiciosYprocesos;

import java.io.*;

public class Ejercicio2ComprobarArgumentos {
  public static void main(String[] args) throws IOException {

	//creamos objeto File al directorio donde esta Ejemplo2
	File directorio = new File("C:\\Users\\Usuario\\eclipse-workspace\\programacionServiciosYprocesos\\bin\\programacionServiciosYprocesos");	

	//El proceso a ejecutar es Ejemplo2			
	ProcessBuilder pb = new ProcessBuilder("java", "ComprobarArgumentos2", "Sara");

    //se establece el directorio donde se encuentra el ejecutable
    pb.directory(directorio);
        
	System.out.printf("Directorio de trabajo: %s%n",pb.directory());

    //se ejecuta el proceso
	Process p = pb.start();

   //obtener la salida devuelta por el proceso
	try {
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1)
			System.out.print((char) c);
		is.close();
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
}// Ejemplo3
