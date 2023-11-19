package javaCourseEstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalEx5 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura condicional EX5 - Valor a pagar -----");
		
		Scanner sc = new Scanner(System.in);
		
		int cod, quantidade;
		double total;
		
		System.out.println("Insira o código do produto: ");
		cod = sc.nextInt();
		
		System.out.println("Insira o quantidade do produto: ");
		quantidade = sc.nextInt();
		
		if(cod == 1) {
			total = quantidade * 4.00;
		}
		else if(cod == 2) {
			total = quantidade * 4.50;
		}
		else if(cod == 3) {
			total = quantidade * 5.0;
		}
		else if(cod == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Preco total: R$ %.2f%n", total);
		
		sc.close();

	}

}
