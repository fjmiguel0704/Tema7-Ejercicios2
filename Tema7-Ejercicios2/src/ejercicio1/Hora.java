package ejercicio1;

/**
 * Esta clase almacena una hora, minutos y segundos de ella. Incrementado y
 * reseteando las horas, minutos y segundos cuando se de el caso, siguiendo el
 * formato original
 * 
 * @author fjmiguel
 *
 */
public class Hora {
	/**
	 * Hora actual de una hora
	 */
	private int hora;
	/**
	 * Minutos actuales de una hora
	 */
	private int minutos;
	/**
	 * Segundos actuales de una hora
	 */
	private int segundos;

	/**
	 * Constructo vacío
	 */
	public Hora() {

	}

	/**
	 * Constructo que asigna valores a horas, minutos y segundos
	 * 
	 * @param hora     actual
	 * @param minutos  actuales
	 * @param segundos actuales
	 */
	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	/**
	 * Este método devuelve la hora actual
	 * 
	 * @return la hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Este método actualiza la hora
	 * 
	 * @param hora a actualizar
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * Este método devuelve los minutos actuales
	 * 
	 * @return los minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * Este método actualiza los minutos
	 * 
	 * @param minutos a actualizar
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * Este método devuelve los segundos actuales
	 * 
	 * @return los segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * Este método actualiza los segundos
	 * 
	 * @param segundos a actualizar
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	/**
	 * Este método incrementa un segundo. Va incrementando los minutos cuando los
	 * segundos sean igual a 60 y segundos se resetean a 0. También incrementa las
	 * horas cuando los minutos sean igual a 60 y minutos se resetean a 0. Cuando
	 * las horas sean las 23, la siguiente en incrementar pasarán a ser las 00
	 */
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
