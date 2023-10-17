package programacionServiciosYprocesos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedEntradaTeclado {
	public static void main(String[] args) {
		//InputStreamReader in = new InputStreamReader(System.in);
		//BufferedReader bu = new BufferedReader(in);
		
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));

		String cad1 = "", cad2 = "";
		try {
			System.out.println("Introduce un numero");
			cad1 = bu.readLine();
			System.out.println("Introduce otro numero");
			cad2 = bu.readLine();
			bu.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(isNumeric(cad1) && isNumeric(cad2)) {
			System.out.println(Integer.parseInt(cad1)+Integer.parseInt(cad2));
			System.exit(0);
		}
		System.exit(1);
		
	}
	
	public static boolean isNumeric (String cad) {
		boolean respuesta= true;
		int num;
		try {
			num= Integer.parseInt(cad);
		}catch (NumberFormatException e) {
			e.printStackTrace();
			respuesta= false;
		}
		return respuesta;
	}
}
