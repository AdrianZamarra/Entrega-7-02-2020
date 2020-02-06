package Entrega7220;

import java.util.*;

public class Ejercicio3 {
	private static ArrayList<Procesos> listaProcesos = new ArrayList<Procesos>();
	 
	private static Scanner s = new Scanner(System.in);

	public static void añadirProcesos() {

		String nameProcess;
		System.out.println("Dame el nombre del proceso");
		nameProcess = s.nextLine();
		listaProcesos.add(new Procesos(nameProcess));
		System.out.println("Has añadido "+listaProcesos.size()+" procesos");

	}

	public static void ejecutarProcesos() {

		listaProcesos.remove(0);
		System.out.println("Quedan " + listaProcesos.size() + " procesos por ejecutar");

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int option;

		do {
			System.out.println("-------Algoritmo FIFO------- \n 1.Añadir proceso \n 2.Permitir acceso \n 3.Salir");
			option = s.nextInt();
			switch (option) {
			case 1:
				System.out.println("Añade un proceso a la cola ");
				añadirProcesos();

				break;

			case 2:

				System.out.println("-------------- \n Se va ha ejecutar el proceso: "+listaProcesos.get(0).dameDatos());
				ejecutarProcesos();

				break;
			case 3:
				System.out.println("Saliendo del algoritmo FIFO.");
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

class Procesos {

	public Procesos(String nombre) {

		this.nombre = nombre;
	}

	public String dameDatos() {

		return nombre ;
	}

	private String nombre;

}