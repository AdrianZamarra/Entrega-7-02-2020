package Entrega7220;

import java.util.*;

public class Prueba {

	private static void MostrarArray(String empresa1[], int[][][] sueldos, String[][] empleados) {

		int salMedMaxTot = 0;
		int salMedMax = 0;
		int salMed = 0;
		int sumaSal = 0;
		String pos = "";
		String posMax = "";

		// Bucle plara mostrar nombre empresa

		for (int y = 0; y < empresa1.length; y++) {
			System.out.println("---------------------- \n EMPRESA: " + empresa1[y] + "\n----------------------");

			for (int z = 0; z < 4; z++) {
				System.out.println("==============================================\nEmpleado " + empleados[y][z] + "\n");

				for (int j = 0; j < 5; j++) {
					System.out.println("El sueldo del mes " + (j + 1) + " : " + sueldos[y][z][j] + " €");
					sumaSal += sueldos[y][z][j];

				}
				salMed = sumaSal / sueldos[y][z].length;
				System.out.println("----------------------\nSu salario medio es: " + salMed + " €");
				sumaSal = 0;

				if (salMed > salMedMaxTot) {
					pos = "El salario medio mas alto pertenece a (" + y + "," + z+")";
					salMedMaxTot = salMed;
				}
	            if(salMedMax < salMedMaxTot){
	            	
	                posMax = "La posicion del emplado con el sueldo mas alto de todas las empresas es: [" + y + ", " + z + "]";
	               
	                salMedMaxTot = salMedMax;
	            }
	            
			}
			
		}
		System.out.println("=------------------=\n"+posMax);
	}

	public static void main(String[] args) {

		String[] empresas = { "Aporpizza", "Telepizza", "Doce vita" };
		String[][] empleados = { { "Bryan", "Aglaya", "Luis", "Cristhian" }, { "Jorge", "Paul", "Niko", "Raspe" },
				{ "Fabbio", "Mario", "Luigi", "Maurizio" } };
		int[][][] sueldos = new int[3][4][5];

		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				for (int z = 0; z < 5; z++) {
					sueldos[i][j][z] = r.nextInt(2000) + 2000;
				}
			}
		}

		MostrarArray(empresas, sueldos, empleados);
		
	}

}
