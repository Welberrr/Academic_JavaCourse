package javaCourseEstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalEx2 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Condicional Ex2 - Par ou Impar -----");
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Insira um número: ");
		N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("Este número é par!");
		}
		else {
			System.out.println("Este número é impar!");
		}
		
		sc.close();

	}

}
