package Entrega7220;

import java.util.*;
public class Ejercicio2 {
	
	private static void muestraArray(int[][][] sueldo, String[] empresa, String[][] empleados) {
		
	    int salarioMedioMaxTotal = 0;
	    String indiceTotal = "";

	    // ITERO POR CADA EMPRESA
	    for (int i = 0; i < sueldo.length; i++){

	        System.out.println("Empresa: " + empresa[i]);
	        // VARIABLE STRING EN LA QUE SE GUARDARA LA CADENA QUE DIRA LOS ÍNDICES DE EMPLEADO CON SUELDO MEDIO MAS ALTO
	        String indice = "";

	        int salarioMedioMaximo = 0;

	        // ITERO POR CADA EMPLEADO
	        for (int j = 0; j < sueldo[i].length; j++){
	            System.out.println("    Empleado: " + empleados[i][j]);

	            // VARIABLE QUE VA GUARDANDO LA SUMA DEL SALARIO
	            int sumaSalario = 0;

	            // ITERO POR LOS MESES
	            for (int z = 0; z < sueldo[i][j].length; z++){

	                System.out.print("        Sueldo del " + (z + 1) + "º mes: ");
	                System.out.println(sueldo[i][j][z]);
	                sumaSalario += sueldo[i][j][z];
	            }

	            // REALIZO EL SALARIO MEDIO
	            int salarioMedio = sumaSalario / sueldo[i][j].length;

	            // COMPRUEBO SI SU SALARIO MEDIO ES MAYOR QUE EL MAXIMO
	            // SI ES ASÍ GUARDO SUS INDICES EN LA VARIABLE INDICE
	            if (salarioMedio > salarioMedioMaximo){
	                indice = "El empleado con el Sueldo medio mas alto es el : /" + i + ", " + j + "/";
	                salarioMedioMaximo = salarioMedio;
	            }

	            if(salarioMedioMaximo > salarioMedioMaxTotal){
	                indiceTotal = "Índices del array del empleado de las tres empresas con el sueldo medio más alto: [" + i + ", " + j + "]";
	                salarioMedioMaxTotal = salarioMedioMaximo;
	            }

	            System.out.print("        El salario medio del trabajador es: ");
	            System.out.println( salarioMedio);
	            System.out.println("------------------------------------------------------------------");
	        }
	        System.out.println(indice);
	        System.out.println("=============");

	    }

	    System.out.println(indiceTotal);
	}

	public static void main(String[] args) {
		
		int[][][] sueldo = new int[3][4][5];
		String[][] empleados = {{"Bryan", "Luis", "Aglaya", "Christian"}, {"Jorge", "Paul", "Niko", "Roberto"}, {"Julian", "Alberto", "Fabbio", "Enzo"}};
		String [] empresa = {"Aporpizza","Telepizza","Dolce Vita"};
		
        Random r = new Random();

        // RELLENO EL ARRAY CON NUMEROS ALEATORIOS
        for (int i = 0; i < sueldo.length; i++){
            for (int j = 0; j < sueldo[i].length; j++){
                for (int z = 0; z < sueldo[i][j].length; z++){
                    sueldo[i][j][z] = r.nextInt(2000) + 2000;
                }
            }
        }
		
        muestraArray(sueldo,empresa,empleados);
		
	}

}
