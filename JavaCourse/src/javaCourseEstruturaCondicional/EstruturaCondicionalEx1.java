package javaCourseEstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalEx1 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Condicional Ex1 - Negativou ou Positivo -----");
		
		Scanner sc = new Scanner(System.in);
		
		int nmr;
		
		System.out.println("Insira o primeiro número: ");
		nmr = sc.nextInt();
		
		if (nmr >= 0) {
			System.out.println("Este número é positivo!");
		}
		
		else {
			System.out.println("Este número é negativo!");
		}
			
		
		sc.close();

	}

}
