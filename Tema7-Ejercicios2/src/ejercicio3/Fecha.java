package ejercicio3;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	boolean esBisiesto() {
		boolean bisiesto = false;
		if (año % 4 == 0) {
			bisiesto = true;
		}

		return bisiesto;
	}

	boolean fechaCorrecta() {
		boolean estado = false;
		switch (mes) {
		case 1: {
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

		case 3: {
			if (dia > 0 && dia < 32) {
				estado = true;
			}
		}

		case 4: {
			if (dia > 0 && dia < 31) {
				estado = true;
			}
		}

		case 5: {
			if (dia > 0 && dia < 32) {
				estado = true;
			}
		}

		case 6: {
			if (dia > 0 && dia < 31) {
				estado = true;
			}
		}

		case 7: {
			if (dia > 0 && dia < 32) {
				estado = true;
			}
		}

		case 8: {
			if (dia > 0 && dia < 32) {
				estado = true;
			}
		}

		case 9: {
			if (dia > 0 && dia < 31) {
				estado = true;
			}
		}

		case 10: {
			if (dia > 0 && dia < 32) {
				estado = true;
			}
		}

		case 11: {
			if (dia > 0 && dia < 31) {
				estado = true;
			}
		}

		case 12: {
			if (dia > 0 && dia < 32) {
				estado = true;
			}
		}
		}

		return estado;
	}

	void diaSiguiente() {
		dia++;
		fechaCorrecta();
	}

	public String toString() {
		String result = "";
		if (dia < 10) {
			result = "0" + dia + "-"  + mes + "-" + año;
		}
		
		if (mes<10) {
			result =  dia + "-" + "0" + mes + "-" + año;
		}
		
		if (dia < 10 && mes < 10) {
			result = "0" + dia + "-" + "0" + mes + "-" + año;
		}

		if (dia>9 && mes>9) {
			result = dia + "-" + mes + "-" + año;
		}

		return result;
	}
}
