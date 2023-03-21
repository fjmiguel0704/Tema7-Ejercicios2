package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int segundosIncre;
		Scanner read = new Scanner(System.in);

		Hora objeto = new Hora(23, 59, 40);

		System.out.println("Introduce los segundos a incrementar: ");
		segundosIncre = read.nextInt();

		for (int i = 0; i < segundosIncre; i++) {
			objeto.incrementaSegundo();
		}
		
		System.out.println(objeto.getHora() + " : " + objeto.getMinutos() + " : " + objeto.getSegundos());
	}

}
