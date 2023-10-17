package programacionServiciosYprocesos;

public class Ejercicio2_4 implements Runnable {
	String frase;
	
	public Ejercicio2_4 (String frase) {
		this.frase=frase;
	}
	public void run () {
		System.out.println("Hola mundo " +frase);
	};
	
}


