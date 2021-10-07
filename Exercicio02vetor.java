/*
 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
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
		System.out.println("A média dos valores: " + media);
	
	}

}
