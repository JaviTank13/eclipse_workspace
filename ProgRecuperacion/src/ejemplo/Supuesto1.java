package ejemplo;

import java.util.Scanner;

public class Supuesto1 {
	public static void main(String[] args) {
		int n;

		do {
			n = pideEntero("Introduzca el numero (No puede superar 15 ni ser menor que 5)");
		} while (n < 5 || n > 15);
		escala(n);

	}

	public static int pideEntero(String mensaje) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
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
		return num;
	}

	public static void escala(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
