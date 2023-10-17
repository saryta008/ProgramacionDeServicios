package programacionServiciosYprocesos;
import java.util.Arrays;

public class ComprobarArgumentos {
	public static void main(String [] args) {
		if(args.length < 1)
			System.exit(1);
		else if (args.length==1) {
			if(isNumeric(args[0]) && Integer.parseInt(args[0])<0){ 
			System.exit(3);
		}else {
			System.exit(2);
			}
		}else {
				System.exit(0);
			}
		}

	public static boolean isNumeric(String cadena) {
			boolean resultado;
			try {
				Integer.parseInt(cadena);
				resultado= true;
			}catch (NumberFormatException excepcion) {
				resultado= false;
			}
			return resultado;
		}

}
