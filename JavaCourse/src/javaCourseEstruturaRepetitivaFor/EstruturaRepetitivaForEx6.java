package javaCourseEstruturaRepetitivaFor;

import java.util.Scanner;

public class EstruturaRepetitivaForEx6 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Repetitiva For Ex6 - Divisores -----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println("O resultado é: " + i);
			}
		}
		
		sc.close();
	}

}
