package javaCourseEstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalEx3 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Condicional Ex3 - Múltiplos -----");
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Insira o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0 ) {
			System.out.println("São múltiplos!");
		}
		else {
			System.out.println("Não são múltiplos!");
		}
		
		sc.close();

	}

}
