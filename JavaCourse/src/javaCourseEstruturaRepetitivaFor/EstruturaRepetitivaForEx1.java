package javaCourseEstruturaRepetitivaFor;

import java.util.Scanner;

public class EstruturaRepetitivaForEx1 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Repetitiva For Ex1 - Números Ímpares ------");
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Insira o número desejado: ");
		x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0 ) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
