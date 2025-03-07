package parte1;

import java.util.Scanner;

public class SeisSete {

	public static void main(String[] args) {
		// 6-Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Write the first grade: ");
		double nota1 = sc.nextDouble();
		System.out.print("Write the second grade: ");
		double nota2 = sc.nextDouble();
		System.out.print("Write the third grade: ");
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
				
		System.out.printf("The GPA is %f\n", media);
		
		
		// 7 -Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno 
		//e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.
		
		System.out.print("Write the fourth grade: ");
		double nota4 = sc.nextDouble();
		
		System.out.print("Write the student's name: ");
		String name = sc.next();
		
		media = (media + nota4) / 2;

		if (media >= 7) {
			System.out.printf("%s, your final GPA is %f, you are approved!\n",name, media); 
		}
		else {
			System.out.printf("%s, your final GPA is %f, you are disapproved.\n",name, media);
		}
		
		
		
		sc.close();
		
	}

}
