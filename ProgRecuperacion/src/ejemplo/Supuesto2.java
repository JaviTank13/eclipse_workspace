package ejemplo;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Supuesto2 {
	public static void main(String[] args) {

		mostrar();

	}

	public static void mostrar() {

		int opc;
		Scanner sc = new Scanner(System.in);

		boolean ok = false;
		do {
			try {
				System.out.println("-----------\nMenú\n-----------\n1. Convertir a Binario\n0. Salir");
				opc = sc.nextInt();

				ok = true;

				switch (opc) {
				case 1:
					pasarBinario("Ingresa un numero decimal");

					break;
				case 0:
					System.out.println("Fin del programa");

					break;

				default:

					System.out.println("Introduce un numero que esta en las opciones");
					sc.next();
					break;

				}

			} catch (Exception e) {
				System.out.println("Introduzca un número válido");
				sc.next();
			}

		} while (!ok);

	}

	public static void pasarBinario(String mensaje) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = 0;
			int binario = 0;
			
			boolean ok = false;
			do {
				try {
					System.out.println(mensaje);
					num = sc.nextInt();
					ok = true;

				} catch (Exception e) {
					System.out.println("Introduzca un número válido");
					sc.next();
				}

			} while (!ok);
			
			

			for (int i = 0; i < 1; i++) {
				binario = num % 2;
				
				
			}
			System.out.println("El ultimo numero binario es: " + binario);
		}

	}

}