/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/


package br.com.exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio04Matrizes {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int[][] valores = new int[3][3];
	
	System.out.println("**********MATRIZ 3X3**********");
	
	
	for(int l = 0; l < valores.length; l++) {
		
		for(int c = 0; c < valores[l].length; c++) {
			System.out.printf("Digite os valores: %d %d: ", l,c);
			valores[l][c] = leia.nextInt();
		}
		 System.out.println();
	}
	
	for(int l = 0; l < valores.length; l++) {
		for(int c=  0; c < valores[l].length; c++) {
			System.out.printf(valores[l][c] + ", ");
		}
		System.out.println();
	}
	}

}
