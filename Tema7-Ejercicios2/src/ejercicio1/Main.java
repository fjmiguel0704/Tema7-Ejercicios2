package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int segundosIncre;
		Scanner read = new Scanner (System.in);
		
		Hora objeto = new Hora(23, 59, 57);
		
		System.out.println("Introduce los segundos a incrementar: ");
		segundosIncre=read.nextInt();

		objeto.incrementaSegundo(segundosIncre);
		System.out.println(objeto.getHora() + " : " + objeto.getMinutos() + " : " + objeto.getSegundos());
	}

}
