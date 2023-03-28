package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Objeto, al que se le pasa como parámetro al constructor el valor 5
		Contador objeto = new Contador(5);

		// Objeto 2, copia del primer objeto
		Contador objeto2 = new Contador(objeto);

		// Llamamos al metodo incrementar con el valor de cont primer objeto
		objeto.incrementar();

		// Y al metodo decrementar con el valor de cont segundo objeto
		objeto2.decrementar();

		// Imprimimos el valor actual de cont del primer objeto
		System.out.println("Incremento: " + objeto.getCont());

		// Y el valor actual de cont del segundo objeto
		System.out.println("Decremento: " + objeto2.getCont());
	}

}
