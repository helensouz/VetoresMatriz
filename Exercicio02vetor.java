/*
 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
*/

package br.com.exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio02vetor {
		public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);	
		
		int[] lancamento = new int[5];
		int soma=0, media=0;
		
	
		
		for(int l = 0; l < 5 ; l++) {
			System.out.println("Digite os 5 lancamentos");
			lancamento[l] = ler.nextInt();
		
			soma = soma + lancamento[l];
			media = soma / lancamento.length;
	
 		}
		
		System.out.println("A soma dos valores: " + soma);
		System.out.println();
		System.out.println("A m�dia dos valores: " + media);
	
	}

}
