package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		Disco discos [] = new Disco [10];
		
		Disco objeto = new Disco ();
		
		Scanner read = new Scanner (System.in);
		
		objeto.setCodigo(read.next());
		objeto.setTitulo(read.next());
		objeto.setAutor(read.next());
		objeto.setGenero(read.next());
		objeto.setDuracion(read.nextInt());

		System.out.println("COLECCIÓN DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		
		System.out.println("Introduce una opción: ");
		opcion=read.nextInt();
		
		do {
			switch (opcion) {
			case 1: {
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while (opcion!=5 );
		 
		
	}

}
