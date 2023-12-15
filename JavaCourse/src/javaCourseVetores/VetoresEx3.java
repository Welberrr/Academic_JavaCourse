package javaCourseVetores;

import java.util.Scanner;

public class VetoresEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----- VETORES EXERCÍCIO 3 - ALTURA -----");
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.println("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		double media = 0;
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			soma = soma + alturas[i];
		}
		
		media = soma / n;
		
		System.out.println();
		System.out.printf("A média de altura é: %.2f%n", media);
		
		int cont = 0;
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				cont = cont + 1;
			}
		}
		
		double porc = cont * 100.0 / n;
		
		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%%n", porc);
		
		for (int i=0; i<n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
