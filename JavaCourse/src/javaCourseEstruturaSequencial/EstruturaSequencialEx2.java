package javaCourseEstruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencialEx2 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Sequêncial Ex.2 - Raio de um circulo -----");
		
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
		
		System.out.println("Insira o valor");
		R = sc.nextDouble();
		
		A = pi * R * R;
		
		System.out.printf("Resultado = %.4f%n", A);
		
		sc.close();

	}

}
