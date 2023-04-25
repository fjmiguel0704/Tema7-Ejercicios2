package ejercicio4;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Creo un array de tipo Disco de 10 posiciones
		Disco[] arrayDiscos = new Disco[10];

		// Posición actual del array
		int posicion = 0;

		// Opción elegida del usuario
		int opcion;

		// Creamos un objeto de tipo Disco y lo asignamos a cada posición
		for (int i = 0; i < arrayDiscos.length; i++) {
			arrayDiscos[i] = new Disco();
		}

		// Mostramos el menú de opciones al usuario
		do {
			System.out.println("COLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.println("Introduzca una opción:");

			// Leemos la opción
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			// En caso de ser 1, si el código del libro no es Libre, lo listamos
			case 1:
				for (Disco disco : arrayDiscos) {
					if (!disco.getCodigo().equals("LIBRE")) {
						System.out.println(disco);
					}
				}
				break;

			// En caso de ser 2, vamos a insertar un nuevo disco
			case 2:
				// Comprobamos que posición hay libre en el array.
				posicion = 0;

				// Mientras posición sea menor a la longitud del array y el código no sea libre,
				// incrementamos la posición
				while (posicion < arrayDiscos.length && !arrayDiscos[posicion].getCodigo().equals("LIBRE")) {
					posicion++;
				}

				// Si la posición es igual a la longitud del array, posición valdrá -1
				if (posicion == arrayDiscos.length) {
					posicion = -1;
				}

				// if posición es menor a 0, no hay hueco para añadir un nuevo disco
				if (posicion < 0) {
					System.out.println("No hay hueco");

					// En caso contrario, insertamos un nuevo disco
				} else {
					int contador = 0;
					String codigo;
					String autor, titulo, genero;
					int duracion;

					codigo = String.valueOf(contador);

					System.out.println("Introduzca el autor del disco:");
					autor = sc.nextLine();

					System.out.println("Introduzca el titulo del disco:");
					titulo = sc.nextLine();

					System.out.println("Introduzca el genero del disco:");
					genero = sc.nextLine();

					System.out.println("Introduzca la duración del disco:");
					duracion = sc.nextInt();

					arrayDiscos[contador] = new Disco(codigo, autor, titulo, genero, duracion);

				}
				break;

			// En caso de 3, modificamos un disco
			case 3:
				String autor, titulo, genero;
				int codigo, duracion;

				// Pedimos el codigo del libro a modificar
				System.out.println("Introduzca el código del disco a modificar");
				codigo = sc.nextInt();
				sc.nextLine();

				// Si el código no es Libre, vamos pidiendo datos y sobreescribiendo
				if (!arrayDiscos[codigo].getCodigo().equals("LIBRE")) {
					System.out.println("Introduzca el autor del disco:");
					autor = sc.nextLine();
					arrayDiscos[codigo].setAutor(autor);

					System.out.println("Introduzca el titulo del disco:");
					titulo = sc.nextLine();
					arrayDiscos[codigo].setTitulo(titulo);

					System.out.println("Introduzca el genero del disco:");
					genero = sc.nextLine();
					arrayDiscos[codigo].setGenero(genero);

					System.out.println("Introduzca la duración del disco:");
					duracion = sc.nextInt();
					arrayDiscos[codigo].setDuracion(duracion);

					// En caso contrario, no se puede modificar
				} else {
					System.out.println("En esa posición no hay ningún disco a modificar");
				}

				break;

			// En caso de 4, borramos un disco
			case 4:

				// Pedimos el código del disco a borrar
				System.out.println("Introduzca el código del disco a borrar");
				posicion = sc.nextInt();
				sc.nextLine();

				// Si la posición es mayor o igual a 0 y menor a la longitud del array
				if (posicion >= 0 && posicion < arrayDiscos.length) {
					// Ponemos su codigo a LIBRE
					arrayDiscos[posicion].setCodigo("LIBRE");

					// En caso contrario, el código no es válido
				} else {
					System.out.println("Código no válido");
				}

				break;

			// En caso de 5, salir del programa
			case 5:
				System.out.println("SALIENDO...");
				break;

			// Cualquier otra opción no es válida
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 5); // Mientras opción sea distinto a 5

	}

}
