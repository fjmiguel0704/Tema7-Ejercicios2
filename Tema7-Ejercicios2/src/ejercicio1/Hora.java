package ejercicio1;

public class Hora {
	int hora;
	int minutos;
	int segundos;

	public Hora() {
		// Constructor vacío
	}

	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void incrementaSegundo() {
		segundos++;
		if (segundos >= 60) {
			segundos = 0;
			minutos++;
		}

		if (minutos == 60) {
			minutos = 0;
			segundos = 0;
			hora++;
		}

		if (hora >= 24) {
			hora = 0;
		}
	}

}
