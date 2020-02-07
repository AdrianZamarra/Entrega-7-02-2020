package Entrega7220;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n;
		int count = 0;

		String[] palabra;
		String[] ordenpalabras;
		Scanner s = new Scanner(System.in);
		System.out.println("Cuantas plabras deseas añadir: ");

		n = s.nextInt();

		palabra = new String[n];
		ordenpalabras = new String[n];

		System.out.println("Escriba " + n + " palabras");
		s.nextLine();

		for (int i = 0; i < n; i++) {

			palabra[i] = s.nextLine();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (palabra[i].compareTo(palabra[j]) > 0) {
					count++;
				}

			}
			ordenpalabras[count] = palabra[i];

			count = 0;

		}
		for (int i = 0; i < n; i++) {
			System.out.println(ordenpalabras[i]);
		}
		s.close();
	}

}
