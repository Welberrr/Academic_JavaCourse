package javaCourseEstruturaRepetitivaFor;

import java.util.Scanner;

public class EstruturaRepetitivaForEx4 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Repetitiva For Ex4 - Pares -----");
		
		Scanner sc = new Scanner(System.in);
		
		int x, a, b, resultado;
		
		System.out.println("Insira a quantidade desejada: ");
		x = sc.nextInt();
		
		for (int i = 0; i < x; i++ ) {
			
			System.out.println("Insira o primeiro número: ");
			a = sc.nextInt();
			
			System.out.println("Insira o segundo número: ");
			b = sc.nextInt();
			
			if (b == 0 ){
				System.out.println("Divisão impossivel!");
			}
			else {
				resultado = a / b;
				
				System.out.println("O resultado é: " + resultado);
			}	
		}
		
		sc.close();

	}

}
