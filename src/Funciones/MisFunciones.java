package Funciones;

import java.time.temporal.JulianFields;
import java.util.*;

public class MisFunciones {
	public static void imprimirMatriz(int[][][] matriz) {

		int n, m,p;

		n = matriz.length;
		m = matriz[0].length;
		p= matriz[0][0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				for (int x = 0; x < m; x++)
					System.out.print(matriz[i][j][x] + " ");
			System.out.println("");
		}
	}

	public static void imprimirMatriz(String[][] matriz) {

		int n, m;

		n = matriz.length;
		m = matriz[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println("");
		}
	}

	public static int[][][] inicializaMatriz(int[][][] M, int tope) {

		Random r = new Random();
		int nFilas, nCols, nProf;

		nFilas = M.length;
		nCols = M[0].length;
		nProf = M[0][0].length;

		for (int i = 0; i < nFilas; i++)
			for (int j = 0; j < nCols; j++)
				for (int x = 0; x < nProf; x++)
					M[i][j][x] = r.nextInt(tope + 1);

		return M;
	}

	public static int[][] inicializaMatrizSalarios(int[][] M, int salarioMin, int rango) {

		Random r = new Random();
		int nFilas, nCols;

		nFilas = M.length;
		nCols = M[0].length;

		for (int i = 0; i < nFilas; i++)
			for (int j = 0; j < nCols; j++)
				M[i][j] = salarioMin + r.nextInt(rango + 1);

		return M;
	}

	public static String[][] rellenaMatriz(String[][] M) {

		int nFilas, nCols;

		nFilas = M.length;
		nCols = M[0].length;

		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nCols; j++) {
				if (i == 0 || i == nFilas - 1 || j == 0 || j == nCols - 1)
					M[i][j] = "X";
				else
					M[i][j] = "-";
			}
		}
		return M;

	}


}
