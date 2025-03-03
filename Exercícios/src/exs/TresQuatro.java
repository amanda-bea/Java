package exs;

import java.util.Arrays;
import java.util.Scanner;

public class TresQuatro {

	public static void main(String[] args) {
		//3-Faça um algoritmo que leia dois valores booleanos (lógicos) 
		//e determine se ambos são VERDADEIRO ou FALSO.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write a boolean value: ");
		boolean a = sc.nextBoolean();
		System.out.print("Write another boolean value: ");
		boolean b = sc.nextBoolean();
		
		if(a && b) {
			System.out.println("The values are TRUE");
		}
		else if(!a && !b) {
			System.out.println("The values are FALSE");
		}
		else {
			System.out.println("The values are different");
		}
		
		
		//4-Faça um algoritmo que leia três valores inteiros diferentes 
		//e imprima na tela os valores em ordem decrescente.
		
		System.out.print("Write three integer values: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int array[] = {x, y, z};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		
		sc.close();

	}

}
