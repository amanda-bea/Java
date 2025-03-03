package exs;

import java.util.Scanner;

public class NoveDez {

	public static void main(String[] args) {
		// 9 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your name? ");
		String name = sc.next();
		System.out.print("What's your age? ");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.printf("Yes %s, you are an adult\n", name);
		}
		else {
			System.out.printf("No %s, you are not an adultan", name);
		}
		
		
		//10 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
		System.out.print("Write two values: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.printf("A = %f\nB = %f\nLet's swap!\n", a, b);
		
		double temp = a;
		a = b;
		b = temp;
		System.out.printf("Now A = %f and B = %f", a, b);
		
		
		sc.close();
	}

}
