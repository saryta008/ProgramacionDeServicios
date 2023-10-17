package programacionServiciosYprocesos;

import java.io.IOException;

public class Ejemplo1 {
public static void main (String [] Args) throws IOException {
	ProcessBuilder pb = new ProcessBuilder ("notepad");
	Process pro = pb.start(); 
	
}
}
