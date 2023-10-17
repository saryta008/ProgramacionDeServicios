package programacionServiciosYprocesos;

public class Ejecutar_Ejercicio2_4 {
public static void main (String [] args) {
	Ejercicio2_4 h1= new Ejercicio2_4("Hola");
	Ejercicio2_4 h2= new Ejercicio2_4("Bonjuor");
	Ejercicio2_4 h3= new Ejercicio2_4("Hello");
	Ejercicio2_4 h4= new Ejercicio2_4("Ciao");
	Ejercicio2_4 h5= new Ejercicio2_4("Halo");
	
	Thread hilo1 = new Thread(h1);
	Thread hilo2 = new Thread(h2);
	Thread hilo3 = new Thread(h3);
	Thread hilo4 = new Thread(h4);
	Thread hilo5 = new Thread(h5);
	hilo1.start();
	hilo2.start();
	hilo3.start();
	hilo4.start();
	hilo5.start();
	
}
}
