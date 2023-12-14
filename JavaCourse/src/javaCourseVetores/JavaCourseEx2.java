package javaCourseVetores;

import java.util.Scanner;

public class JavaCourseEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- VETORES EXERCÍCIO 2 - SOMA E MÉDIA -----");
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double vetor[] = new double [n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		double media = 0;
		
		for (int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		
		media = soma / n;
		
		System.out.printf("VALORES: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.printf("\nSOMA: = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		sc.close();
	}

}
