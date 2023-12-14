package javaCourseVetores;

import java.util.Scanner;

public class VetoresEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- VETORES EXERCÍCIO 1 - NÚMEROS NEGATIVOS -----");
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int [n];
		
		for (int i=0; i<n; i++ ) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos: ");
		
		for (int i=0; i<n; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();
	}

}
