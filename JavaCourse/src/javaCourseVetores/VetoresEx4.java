package javaCourseVetores;

import java.util.Scanner;

public class VetoresEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- VETORES EXERCÍCIO 4 - NÚMEROS PARES -----");

		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt(); 
		}
		
		System.out.println("Números pares: ");
		
		int qntdPares = 0;
		for(int i=0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d " , vetor[i]);			
				qntdPares++;
			}
		}
		
		System.out.println();
		System.out.printf("Quantidade de pares = %d\n", qntdPares);
				
		sc.close();
	}

}
