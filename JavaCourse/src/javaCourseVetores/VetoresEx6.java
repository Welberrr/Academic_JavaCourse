package javaCourseVetores;

import java.util.Scanner;

public class VetoresEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- VETORES EXERCÍCIO 6 - SOMA A, B e C -----");

		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		System.out.println("Didite os valores do vetor A: ");
		for (int i=0; i<n; i++) {
			vetor[i] = sc.nextInt();
		}
		
		int vetorB[] = new int[n];
		
		System.out.println("Digite os valores do vetor B");
		for (int i=0; i<n; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		int vetorC[] = new int[n];
		
		for(int i=0; i<n; i++) {
			vetorC[i] = vetor[i] + vetorB[i];
		}
		
		System.out.println("Vetor Resultante: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%d\n", vetorC[i]);
		}
		
		sc.close();
	}

}
