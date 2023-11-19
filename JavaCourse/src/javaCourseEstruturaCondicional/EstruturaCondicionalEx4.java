package javaCourseEstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalEx4 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Condicional EX4 - Duração do jogo -----");
		
		Scanner sc = new Scanner(System.in);
		
		int hrIn, hrFinal, duracao;
		
		System.out.println("Insira a hora inicial do jogo: ");
		hrIn = sc.nextInt();
		
		System.out.println("Insira a hora final do jogo: ");
		hrFinal = sc.nextInt();
		
		if(hrIn < hrFinal) {
			duracao = hrFinal - hrIn;
		}
		else {
			duracao = 24 - hrIn + hrFinal;
		}
		
		System.out.println("O jogo durou " + duracao + "hora(s)");
		
		sc.close();

	}

}
