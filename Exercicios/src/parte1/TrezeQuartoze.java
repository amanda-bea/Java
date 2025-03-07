package parte1;

import java.util.Scanner;

public class TrezeQuartoze {

	public static void main(String[] args) {
		//13- Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. 
		//Imprima na tela as duas temperaturas. Fórmula: C = (5 * ( F-32) / 9)
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Write the temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (5 * (f-32) / 9);
        System.out.printf("The temperature in Celsius is %.2f. Celsius is better.\n", c);
        
        
        //14- Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. 
        //Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.
        
        double francisco = 1.5;
        double sara = 1.1;
        int anos = 0;
        
        while (francisco >= sara) {
        	francisco += 0.02;
        	sara += 0.03;
        	anos += 1;
        }
        
        System.out.printf("btw, Sara will be taller than Francisco in %d years", anos);
        
        
        sc.close();

	}

}
