package javaCourseEstruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencialEx1 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Sequêncial EX.1 -----");
		
//		Para inserir dados
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Insira o primeiro número");
		n1 = sc.nextInt();
		
		System.out.println("Insira o segundo número");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.println("O resultado da operação é: " + soma);
		
		sc.close();
	
	}

}
