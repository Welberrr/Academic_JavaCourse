package javaCourseEstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalEx8 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Condicional Ex.8 - Impostos ----");
		
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Insira seu salário: ");
		salario = sc.nextDouble();
		
		if(salario <= 2000.00) {
			imposto = 0.0;
			System.out.println("Isento!");
		}
		else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
			System.out.printf("O imposto será de: R$ %.2f%n", imposto);
		}
		else if(salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("O imposto será de: R$ %.2f%n", imposto);
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("O imposto será de: R$ %.2f%n", imposto);
		}
		
		sc.close();

	}

}
