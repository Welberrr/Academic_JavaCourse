package javaCourseVetores;

import java.util.Scanner;

public class VetoresEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- VETORES EXERCÍCIO 8 - MÉDIA PARES -----");

		double media, soma = 0, npares = 0;
		
		System.out.println("Quantos elementos o vetor terá? ");
		int n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Insira um número: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				npares++;
			}
		}
		
		if (npares == 0) {
			System.out.println("Nenhum par!");
		}
		else {
			media = soma / npares;
			
			System.out.printf("Média dos pares = %.1f\n", media);
		}
		
		sc.close();
	}

}
