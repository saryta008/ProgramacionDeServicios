package programacionServiciosYprocesos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComprobarBufferedEntradaTeclado {
	public static void main(String[] args) throws IOException {
	File directorio = new File (".\\programacionServiciosYprocesos");
	ProcessBuilder p = new ProcessBuilder ("java", "BufferedEntradaTeclado");
	p.directory(directorio);
	
	Process x = p.start();
	
	try {
		
	}catch(Exception e) {
		e.printStackTrace();}
	}
}
