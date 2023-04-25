package ejercicio3;

/**
 * Esta clase guarda una fecha con su día, mes y año. Comprobando si la fecha es
 * correcta, según los días que tenga cada mes y si el año es bisiesto o no,
 * para el caso de Febrero. Se incrementará un día a la fecha y se modificará
 * esta correctamente
 */
public class Fecha {
	/**
	 * día del mes
	 */
	private int dia;
	/**
	 * mes del año
	 */
	private int mes;
	/**
	 * año de la fecha
	 */
	private int año;

	/**
	 * Constructor vacío
	 */
	public Fecha() {

	}

	/**
	 * Constructor al que se le asigna valores a dia, mes y año de la fech
	 * 
	 * @param dia del mes
	 * @param mes del año
	 * @param año de la fecha
	 */
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * Este método devuelve el valor actual de dia
	 * 
	 * @return el dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Este método actualiza el dia
	 * 
	 * @param dia a actualizar
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Este método devuelve el valor actual del mes
	 * 
	 * @return el mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Este método actualiza el mes
	 * 
	 * @param mes a actualizar
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Este método devuelve el valor actual del año
	 * 
	 * @return el año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Este método actualiza el año
	 * 
	 * @param año a actualizar
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Este método comprueba si el año de la fecha es bisiesto o no
	 * 
	 * @return true en caso de ser bisiesto y false en caso de no serlo
	 */
	private boolean esBisiesto() {
		boolean bisiesto = false;
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			bisiesto = true;
		}

		return bisiesto;
	}

	/**
	 * Este método comprueba si el dia del mes es correcto o no, dependiendo de cada
	 * mes
	 * 
	 * @return true si es correcto y false si no lo es
	 */
	boolean fechaCorrecta() {
		boolean estado = false;
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12: {
			if (dia > 0 && dia < 32) {
				estado = true;
			}
		}

		case 2: {
			if (esBisiesto()) {
				if (dia > 0 && dia < 30) {
					estado = true;
				}
			} else if (dia > 0 && dia < 29) {
				estado = true;
			}

		}

		case 4, 6, 9, 11: {
			if (dia > 0 && dia < 31) {
				estado = true;
			}

		}

		}
		return estado;
	}

	/**
	 * Este método incrementa el día de la fecha en 1 y actualiza la fecha completa
	 * a la correspondiente después del incremento
	 */
	void diaSiguiente() {
		dia++;

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12: {
			if (dia == 32) {
				dia = 1;
				mes++;
			}

			if (mes == 13) {
				mes = 1;
				año++;
			}

			break;
		}
		case 4, 6, 9, 11: {
			if (dia == 31) {
				dia = 1;
				mes++;
			}

			break;
		}

		case 2: 
			if (esBisiesto()) {
				if (dia == 30) {
					dia = 1;
					mes++;
				}
			}

			else if (dia >= 29) {
				dia = 1;
				mes++;
			}
		

		}

	}

	/**
	 * Este método devuelve el resultado de la fecha final, con su día, mes y año.
	 * Teniendo en cuenta de que si el día o el mes es menor a 10, se deben mostrar
	 * con un 0 delante
	 */
	public String toString() {
		String result = "";
		if (dia < 10) {
			result = "0" + dia + "-" + mes + "-" + año;
		}

		if (mes < 10) {
			result = dia + "-" + "0" + mes + "-" + año;
		}

		if (dia < 10 && mes < 10) {
			result = "0" + dia + "-" + "0" + mes + "-" + año;
		}

		if (dia > 9 && mes > 9) {
			result = dia + "-" + mes + "-" + año;
		}

		return result;
	}
}
