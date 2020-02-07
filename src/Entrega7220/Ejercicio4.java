package Entrega7220;

import java.util.*;

public class Ejercicio4 {
	public static String[] Plantilla = new String[15];
	public static String[] FreePlayers = { "Simon", "Herrerin", "Martinez", "Alvarez", "Nuñez", "Berchiche",
			"Balenziaga", "Capa", "De Marcos", "Lekue", "San Jose", "Vesga", "Garcia", "Kepa", "Williams", "" };
	public static int[] Precio = new int[16];
	public static int[] CostoPrecio = new int[16];
	public static int contador = 0;
	public static int contadorFreePlayers = 15;
	public static int Dinero = 10000000;

	// Para Jugadores Libres (Dar precio y imprimir) tambien comprar
	public static void JugadoresLibres() {
		Scanner s = new Scanner(System.in);
		String decision = new String();
		String jugador = new String();
		for (int i = 0; i < contadorFreePlayers; i++) {

			System.out.println(FreePlayers[i] + "\n" + "Precio: " + Precio[i] + " \n" + " ----------------- ");
		}
		System.out.println("Desea comprar algun jugador (yes/no)");
		decision = s.nextLine();
		if (decision.equalsIgnoreCase("Yes")) {
			System.out.println("Indique cual quiere comprar (NOMBRE): ");
			jugador = s.nextLine();
			for (int i = 0; i < contadorFreePlayers; i++) {
				if (jugador.equalsIgnoreCase(FreePlayers[i])) {
					if (Precio[i] > Dinero) {
						System.out.println("No puedes comprar este jugador");
					} else {
						System.out.println("Has comprado a " + FreePlayers[i] + " por: " + Precio[i]);
						Plantilla[contador] = FreePlayers[i];
						CostoPrecio[contador] = Precio[i];
						Dinero = Dinero - Precio[i];
						contador++;
						// Eliminar jugadores y precio de ARRAY FreePlayers[]
						for (int j = i; j < contadorFreePlayers; j++) {
							FreePlayers[j] = FreePlayers[j + 1];
							Precio[j] = Precio[j + 1];
						}
						contadorFreePlayers--;
					}
				}
			}
		}
	}

	public static void JugadoresComprados() {
		String decision = new String();
		Scanner s = new Scanner(System.in);
		String jugador = new String();
		if (contador < 1) {
			System.out.println("No tienes ningun jugador todavia.\n Ves a la opcion (1) y compra alguno. ");
		} else
			System.out.println("Jugadores que has comprado y su precio: \n ---------------");
		for (int i = 0; i < contador; i++) {

			System.out.println(Plantilla[i] + " ha valido " + CostoPrecio[i] + " \n" + " ----------------- ");
		}
		if (contador >= 1) {
			System.out.println("Desea vender algun jugador (yes/no)");
			decision = s.nextLine();
			if (decision.equalsIgnoreCase("Yes")) {
				System.out.println("Que jugador quieres vender?");
				jugador = s.nextLine();
				for (int i = 0; i < contador; i++) {
					if (jugador.equalsIgnoreCase(Plantilla[i])) {
						System.out.println("Has vendido a " + Plantilla[i] + " por: " + CostoPrecio[i]);
						Dinero = Dinero + CostoPrecio[i];
						FreePlayers[contadorFreePlayers] = Plantilla[i];
						// Borrar y vender jugador de ARRAY Plantilla[]
						for (int j = i; j < contador; j++) {
							Precio[contadorFreePlayers] = CostoPrecio[j];
							Plantilla[j] = Plantilla[j + 1];
						}
						contadorFreePlayers++;
						contador--;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// Ejercicio compra-venta de jugadores.
		Scanner s = new Scanner(System.in);
		int option;
		Random r = new Random();
		for (int i = 0; i < 15; i++) {
			Precio[i] = r.nextInt(500000) + 500000;
		}

		do {
			System.out.println("---Menu de la liga--- \n" + "1.Jugadores libres y precios \n"
					+ "2.Jugadores comprados y precio \n" + "3.Dinero disponible");

			System.out.println("---Seleccione una opcion---");

			option = s.nextInt();

			switch (option) {
			case 1:

				/* Imprimir FreePlayers y Comprar */

				JugadoresLibres();
				break;
			case 2:

				/* Jugadores comprados ,precio y vender */
				JugadoresComprados();

				break;
			case 3:

				/* Dinero del Club */
				System.out.println("Te quedan " + Dinero + " € para fichajes.");

				break;

			default:
				break;
			}
		} while (option != -1200);
		s.close();
	}

}
