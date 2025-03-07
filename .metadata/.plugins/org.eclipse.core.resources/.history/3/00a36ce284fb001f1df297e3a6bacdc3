package imóveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String e1 = sc.nextLine();
        double p1 = sc.nextDouble();
        double pr1 = sc.nextDouble();
        sc.nextLine();
        
        String e2 = sc.nextLine();
        double p2 = sc.nextDouble();
        double pr2 = sc.nextDouble();
        
        Novo casa1 = new Novo(e1, pr1);
        Velho casa2 = new Velho();
        
        casa2.setEndereco(e2);
        casa2.setPreco(pr2);
        
        casa1.setP(p1);
        casa2.setP(p2);
        
        casa1.imprimirDados();
        casa2.imprimirDados();
        
        sc.close(); // Fechar o Scanner
    }
}