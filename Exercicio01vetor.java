/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

package br.com.exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio01vetor {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
		double[] pontuacao = new double[5];
		double valores, maiorDado=0.0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite 5 pontuacoes");
			pontuacao[i] = leia.nextDouble();
			
			if(pontuacao[i] > maiorDado) {
				maiorDado = pontuacao[i];
			}
			
		}
		System.out.println("A maior pontuacao é: " + maiorDado);
		
	}
	}


