package ejercicio2;

public class Contador {
	int cont;

	/**
	 * Constructor por defecto
	 */
	public Contador() {

	}

	public Contador(int cont) {
		this.cont = cont;
		if (cont < 0) {
			System.out.println("El valor no puede ser negativo, tu contador valdrá 0");
			cont = 0;
			this.cont = cont;
		}
	}

	public Contador(Contador newCont) {
		this.cont = newCont.cont;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public int incrementar() {
		cont++;
		return cont;
	}

	public int decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}

		return cont;
	}
}
