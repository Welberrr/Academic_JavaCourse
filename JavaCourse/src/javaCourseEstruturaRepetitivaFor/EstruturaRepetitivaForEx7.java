package javaCourseEstruturaRepetitivaFor;

import java.util.Scanner;

public class EstruturaRepetitivaForEx7 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura repetitiva for Ex7 - Quadrado e Cubo -----");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número desejado: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}

}
