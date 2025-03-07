package parte1;

import java.util.Scanner;

public class UmDois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1-Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse 
		//usuário ganha e imprima na tela o resultado.
		
		double salarioMinimo = sc.nextDouble();
		double salarioUsuario = sc.nextDouble();
		
		double salarios = salarioUsuario / salarioMinimo;
		
		System.out.printf("O usuário recebe %f salário(s) mínimo(s)\n", salarios);
		
		
		//2-Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
		
		double valor = sc.nextDouble();
		double valorReajustado = valor * 1.05;
	
		System.out.printf("O valor reajustado é %f", valorReajustado);
		
		sc.close();

	}

}
