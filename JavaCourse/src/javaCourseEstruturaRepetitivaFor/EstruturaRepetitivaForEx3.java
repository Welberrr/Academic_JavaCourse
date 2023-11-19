package javaCourseEstruturaRepetitivaFor;

import java.util.Scanner;

public class EstruturaRepetitivaForEx3 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Repetitiva For Ex3 - Caso de Teste -----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade desejada: ");
		int x = sc.nextInt();
		
		for (int i=0; i<x; i++) {
			System.out.println("Insira valor A: ");
			double a = sc.nextDouble();
			
			System.out.println("Insira valor A: ");
			double b = sc.nextDouble();
			
			System.out.println("Insira valor A: ");
			double c = sc.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media );
		}
		
		sc.close();
		
	}

}
