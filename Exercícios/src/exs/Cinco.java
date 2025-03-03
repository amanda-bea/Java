package exs;

import java.util.Scanner;

public class Cinco {

	public static void main(String[] args) {
		//5 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) 
		//de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		String categoria;
		
		if (imc < 18.9) {
            categoria = "Abaixo do peso";
        } else if (imc <= 24.9) {
            categoria = "Peso ideal (parabéns)";
        } else if (imc <= 29.9) {
            categoria = "Levemente acima do peso";
        } else if (imc <= 34.9) {
            categoria = "Obesidade grau I";
        } else if (imc <= 39.9) {
            categoria = "Obesidade grau II (severa)";
        } else {
            categoria = "Obesidade grau III (mórbida)";
        }
        
        System.out.printf("Seu IMC é %.2f - %s\n", imc, categoria);
        sc.close();

	}

}
