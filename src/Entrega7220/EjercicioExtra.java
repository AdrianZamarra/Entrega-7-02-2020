package Entrega7220;

import java.util.*;

public class EjercicioExtra {
	private static ArrayList<Procesos2> listaProcesos = new ArrayList<Procesos2>();

	private static Scanner s = new Scanner(System.in);

	public static void añadirProcesos() {

		String nameProcess;
		int timeProcess;
		System.out.println("Dame el nombre del proceso");
		nameProcess = s.nextLine();

		System.out.println("Dame la duracion del proceso");

		timeProcess = s.nextInt();
		s.nextLine();
		listaProcesos.add(new Procesos2(nameProcess, timeProcess));
		System.out.println("Has añadido " + listaProcesos.size() + " procesos");

	}

	public static void ejecutarProcesos() {
		int contador = 0;

		listaProcesos.add(new Procesos2(listaProcesos.get(0).dameDatos(), listaProcesos.get(0).dameTiempo() - 1));
		listaProcesos.remove(0);
		if (listaProcesos.get(0).tiempo <= contador)
			listaProcesos.remove(0);
		System.out.println("Quedan " + listaProcesos.size() + " procesos por ejecutar");

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int option;

		do {
			System.out.println("--Algoritmo Round Robin-- \n 1.Añadir proceso \n 2.Permitir acceso \n 3.Salir");
			option = s.nextInt();
			switch (option) {
			case 1:
				// System.out.println("Añade un proceso a la cola ");
				añadirProcesos();

				break;

			case 2:
				if (listaProcesos.isEmpty()) {
					System.out.println("No hay mas procesos");
				} else {

					System.out.println(
							"-------------- \n Se va ha ejecutar el proceso: " + listaProcesos.get(0).dameDatos()
									+ " con un tiempo de " + listaProcesos.get(0).dameTiempo());
					ejecutarProcesos();
				}

				break;
			case 3:
				System.out.println("Saliendo del algoritmo Round Robin.");
				System.exit(0);
				break;

			default:
				System.out.println("Esa opcion no se encuentra");

				break;
			}
		} while (option != -1200);
		s.close();
	}
}

class Procesos2 {

	private String nombre;
	public int tiempo;

	public Procesos2(String nombre, int tiempo) {

		this.nombre = nombre;
		this.tiempo = tiempo;
	}

	public String dameDatos() {

		return nombre;

	}

	public int dameTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "; duracion: " + tiempo;
	}

}
