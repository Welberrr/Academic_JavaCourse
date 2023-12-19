package javaCourseVetores;

import java.util.Scanner;

public class VetoresEx7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- VETORES EXERCÍCIO 7 - ABAIXO DA MÉDIA -----");
		
		System.out.println("Quantos elementos o vetor terá? ");
		int n = sc.nextInt();
	
		double vetor[] = new double[n];
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		double media = 0;
		
		for(int i=0; i<n; i++) {
			soma = vetor[i] + soma;
		}
		
		media = soma / n;
		
		System.out.println("Média do vetor: " + media);
		System.out.println("Elementos abaixo da média: ");
		
		for (int i=0; i<n; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		
		sc.close();
	}

}
