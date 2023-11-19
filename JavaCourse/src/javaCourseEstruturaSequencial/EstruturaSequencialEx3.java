package javaCourseEstruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencialEx3 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Sequencial Ex.3 - Diferença -----");
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		System.out.println("Insira o primeiro valor");
		A = sc.nextInt();
		
		System.out.println("Insira o segundo valor");
		B = sc.nextInt();
		
		System.out.println("Insira o terceiro valor");
		C = sc.nextInt();
		
		System.out.println("Insira o quarto valor");
		D = sc.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("O resultado da diferença é: " + diferenca);

		sc.close();
		
	}
}
