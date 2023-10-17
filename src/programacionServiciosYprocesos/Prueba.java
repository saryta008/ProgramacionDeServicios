package programacionServiciosYprocesos;
public class Prueba {
public static void main (String []args) {
	if (args.length < 1) {
		System.exit(0);
	}else {
		System.out.println(args[0]);
		System.exit(1);
	}
}
}
