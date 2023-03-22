package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Fecha objeto = new Fecha(28, 2, 2023);
		
		objeto.esBisiesto();
		objeto.fechaCorrecta();
		objeto.diaSiguiente();
		System.out.println(objeto.toString()); 

	}

}
