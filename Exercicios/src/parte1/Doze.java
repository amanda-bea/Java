package parte1;

import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();
        
        System.out.print("Digite o segundo lado: ");
        int lado2 = sc.nextInt();
        
        System.out.print("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();
        

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero (todos os lados iguais).");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles (dois lados iguais).");
            } else {
                System.out.println("Triângulo Escaleno (todos os lados diferentes).");
            }
        } else {
            System.out.println("Os valores não formam um triângulo válido.");
        }
        
        sc.close();
    }
}
