package javaCourseEstruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencialEx6 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Sequencial Ex.6 - Áreas -----");
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Insira o primeiro número: ");
		A = sc.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		B = sc.nextDouble();
		
		System.out.println("Insira o terceiro número: ");
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("ÁREA DO TRIANGULO: %.3f%n", triangulo);
		System.out.printf("ÁREA DO CIRCULO: %.3f%n", circulo);
		System.out.printf("ÁREA DO TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("ÁREA DO QUADRADO: %.3f%n", quadrado);
		System.out.printf("ÁREA DO RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		
	}

}
