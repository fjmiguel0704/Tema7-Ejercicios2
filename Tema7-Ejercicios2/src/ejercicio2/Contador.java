package ejercicio2;

public class Contador {
	private int cont;

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

	public void incrementar() {
		cont++;
	}

	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}
}
