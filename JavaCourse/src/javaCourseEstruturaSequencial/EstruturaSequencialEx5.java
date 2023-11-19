package javaCourseEstruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencialEx5 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Sequencial Ex5 = Peças e Valores -----");
		
		Scanner sc = new Scanner(System.in);
		
		int nmrP1, nmrP2;
		double valorP1, valorP2, valorF;
		
		System.out.println("Insira o número de peças: ");
		nmrP1 = sc.nextInt();
		
		System.out.println("Insira o valor únitario da primeira peça: ");
		valorP1 = sc.nextDouble();
		
		System.out.println("Insira o número de peças: ");
		nmrP2 = sc.nextInt();
		
		System.out.println("Insira o valor únitario da segunda peça: ");
		valorP2 = sc.nextDouble();
		
		valorF = (nmrP1 * valorP1) + (nmrP2 * valorP2);
		
		System.out.printf("O valor a pagar será de: R$ %.2f%n", valorF);
		
		sc.close();
	}

}
