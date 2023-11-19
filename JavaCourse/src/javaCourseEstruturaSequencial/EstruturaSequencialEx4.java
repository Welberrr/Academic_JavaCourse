package javaCourseEstruturaSequencial;

import java.util.Scanner;

public class EstruturaSequencialEx4 {

	public static void main(String[] args) {
		System.out.println("----- Estrutura Sequencial Ex4 - Salário Funcionário -----");
		
		Scanner sc = new Scanner(System.in);
		
		int nmrFun, nmrHRS;
		double valorHR, salario;
		
		System.out.println("Insira o número do funcionário: ");
		nmrFun = sc.nextInt();
		
		System.out.println("Insira o número de horas trabalhadas do funcionário: ");
		nmrHRS = sc.nextInt();
		
		System.out.println("Insira o valor que o funcionário recebe por hora: ");
		valorHR = sc.nextDouble();
		
		salario = nmrHRS * valorHR;
		
		System.out.println("Número do funcionário: " + nmrFun);
		System.out.println("Salário do Funcionário: R$" + salario);
		
		sc.close();
	}
}
