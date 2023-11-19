package javaCourseEstruturaRepetitivaWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhileEx1 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Repetitiva While Ex.1 - Senha -----");
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.println("Insira a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Iválida, por favor tente novamente");
			System.out.println("Senha: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
				
		sc.close();

	}

}
