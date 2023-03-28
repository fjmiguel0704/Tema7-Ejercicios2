package ejercicio3;

public class Main {

	public static void main(String[] args) {

		// Objeto, al que se le pasa como parámetro al constructor un día, un mes y un
		// año
		Fecha objeto = new Fecha(31, 12, 2028);

		// Llamamos al método que comprueba si la fecha introducida es correcta
		objeto.fechaCorrecta();

		// Llamamos al método que incrementa el día de la fecha en 1 y la actualiza
		objeto.diaSiguiente();

		// Imprimimos la fecha actual final
		System.out.println(objeto.toString());

	}

}
