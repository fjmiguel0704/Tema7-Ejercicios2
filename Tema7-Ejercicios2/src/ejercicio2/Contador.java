package ejercicio2;

/**
 * Esta clase incrementa un valor en 1 y decrementa otro en 1
 * 
 * @author fjmiguel
 *
 */
public class Contador {
	/**
	 * Valor a incrementar
	 */
	private int cont;

	/**
	 * Constructor por defecto
	 */
	public Contador() {

	}

	/**
	 * Constructor que asigna valores a cont y comprueba que el valor pasado por
	 * parámetro sea correcto
	 * 
	 * @param cont inicial
	 */
	public Contador(int cont) {
		this.cont = cont;
		if (cont < 0) {
			System.out.println("El valor no puede ser negativo, tu contador valdrá 0");
			cont = 0;
			this.cont = cont;
		}
	}

	/**
	 * Constructor copia de Contador, este va a contener el mismo valor que cont
	 * 
	 * @param newCont
	 */
	public Contador(Contador newCont) {
		this.cont = newCont.cont;
	}

	/**
	 * Este método devuelve el valor actual de cont
	 * 
	 * @return el cont
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Este método actualiza el contador
	 * 
	 * @param cont a actualizar
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * Este método incrementa cont en 1
	 */
	public void incrementar() {
		cont++;
	}

	/**
	 * Este método decrementa cont en 1 y si su valor menor que 0, valdrá 0
	 */
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}
}
