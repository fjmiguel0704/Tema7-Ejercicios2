package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Contador objeto = new Contador(0);
		Contador objeto2 = new Contador(objeto);
		
		objeto.incrementar();
		objeto2.decrementar();
		
		System.out.println("Incremento: " + objeto.getCont());
		System.out.println("Decremento: " + objeto2.getCont());
	}

}
