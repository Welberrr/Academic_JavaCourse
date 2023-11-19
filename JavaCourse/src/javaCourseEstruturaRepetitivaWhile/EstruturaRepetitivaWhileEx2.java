package javaCourseEstruturaRepetitivaWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhileEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("----- Estrutura Repetitiva Ex2 - Quadrantes -----");
		
		int x, y;
		
		System.out.println("Insira a coordenada x: ");
		x = sc.nextInt();
		
		System.out.println("Insira a coordenada y: ");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}

}
