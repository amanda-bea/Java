package parte1;

import java.util.Scanner;

public class QuinzeDezesseis {

	public static void main(String[] args) {
		// 15- Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
		
		System.out.print("The multiplication table of 10:\n");
		
		for(int i=0;i<11;i++) {
			System.out.printf("Table of %d:\n", i);
			for(int j=0;j<11;j++) {
				System.out.printf("%dx%d=%d\n",i,j,(i*j));
			}
		}
		
		//16- Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What table do you want? \n");
		int x = sc.nextInt();
		
		System.out.printf("Table of %d:\n", x);
		for(int i=0;i<11;i++) {
			System.out.printf("%dx%d=%d\n",x,i,(i*x));	
		}
		
		sc.close();

	}

}
