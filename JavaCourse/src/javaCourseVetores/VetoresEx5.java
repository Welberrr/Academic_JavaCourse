package javaCourseVetores;

import java.util.Scanner;

public class VetoresEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- VETORES EXERCÍCIO 3 - MAIOR POSIÇÃO -----");

		int posMaior;
		double maior;
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		posMaior = 0;
		
		for (int i=0; i<n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
		}
		
		System.out.printf("Maior valor: %.1f\n", maior);
		System.out.printf("Posição do maior valor: %d\n", posMaior);
		
		sc.close();
	}

}
