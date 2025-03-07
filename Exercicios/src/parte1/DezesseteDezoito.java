package parte1;

import java.util.Random;
import java.util.Scanner;

public class DezesseteDezoito {

	public static void main(String[] args) {
		//17- Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
		
		Random random = new Random();
		int x = random.nextInt(101);
		
		System.out.printf("Random number: %d\n", x);
		
		
		//18- Faça um algoritmo que efetue o cálculo do salário líquido de um professor. 
		//As informações fornecidas serão: valor da hora aula, horas de aulas lecionadas no mês e percentual de desconto do INSS. 
		//Imprima na tela o salário líquido final.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor da hora aula:" );
		double horaAula = sc.nextDouble();
		System.out.print("Horas de aulas lecionadas no mês: " );
		double horasLecionadas = sc.nextDouble();
		System.out.print("Percentual de desconto do INSS: " );
		double descontoINSS = sc.nextDouble();
		
		double salarioLiquido = (horaAula * horasLecionadas) * (1 - descontoINSS);
		System.out.printf("Salário líquido final: %.2f", salarioLiquido);
		
			
		sc.close();
	}

}
