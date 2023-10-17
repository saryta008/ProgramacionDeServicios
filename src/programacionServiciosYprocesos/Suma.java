package programacionServiciosYprocesos;
import java.io.*;
public class Suma {
public static void main (String []args) {
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(in);
	String cad1, cad2;
	try {
		System.out.println("algo");
		cad1=br.readLine();
		//System.out.println(cad1);
		System.out.println("Introduce otra cadena");
		cad2=br.readLine();
		in.close();
	}catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println((Integer.parseInt(args[0]))+(Integer.parseInt(args[1])));
}
}
