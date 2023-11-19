package javaCourseEstruturaRepetitivaFor;

import java.util.Scanner;

public class EstruturaRepetitivaForEx5 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Repetitiva For Ex5 - Fatorial ------ ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número desejado: ");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println("O fatorial é: " + fat);
		
		sc.close();
	}

}
