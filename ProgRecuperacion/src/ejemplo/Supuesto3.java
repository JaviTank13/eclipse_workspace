package ejemplo;

import java.util.Scanner;

public class Supuesto3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		System.out.println("-------\nMenu\n-------\n1. Rellenar\n2. Ordenar\n3. Mostrar");
		opc = sc.nextInt();
		switch (opc) {
		case 1:
			rellenarMatriz("Ingrese el tamaño de la matriz");

		case 2:
			ordenarMatriz();

		case 3:
			mostrarMatriz();
			break;
		}

	}

	public static void rellenarMatriz(String mensaje) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[][] matriz1 = new int [10][10];
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
		System.out.println("Ingrese i");
		for (int i = 0; i < matriz1.length; i++) {
			i = sc.nextInt();

		}
		System.out.println("Ingrese j");
		for (int j = 0; j < matriz1.length; j++) {
			j = sc.nextInt();
		}

	}

	public static void ordenarMatriz() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int[][] matriz1 = null;
		boolean ok = false;
		do {
			try {
				System.out.println();
				num = sc.nextInt();
				ok = true;

			} catch (Exception e) {
				System.out.println("Introduzca un número válido");
				sc.next();
			}

		} while (!ok);
		System.out.println("Ingrese i");
		for (int i = 0; i < matriz1.length; i++) {
			i = sc.nextInt();

		}
		System.out.println("Ingrese j");
		for (int j = 0; j < matriz1.length; j++) {
			j = sc.nextInt();
		}

	}

	public static void mostrarMatriz() {
		System.out.println("[][][]\n[][][]\n[][][]");
	}

}