package parte1;

import java.time.LocalDate;
import java.util.Scanner;

public class Onze {

	public static void main(String[] args) {
		//11- Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. 
		//Leve em consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 2 meses e 15 dias de vida)

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's your year of birth? ");
		int year = sc.nextInt();
		System.out.print("Month? ");
		int month = sc.nextInt();
		System.out.print("Day? ");
		int day = sc.nextInt();
		
		
		LocalDate date = LocalDate.now();
        int atualYear = date.getYear();
        int atualMonth = date.getMonthValue();
        int atualDay = date.getDayOfMonth();
        
        int totalDaysBirth = day + (month*30) + (year*365);
        int totalDaysAtual = atualDay + (atualMonth*30) + (atualYear*365);
        int totalDays = totalDaysAtual - totalDaysBirth;
        
        int finalYears = totalDays / 365;
        int remainingDays = totalDays % 365;
        int finalMonths = remainingDays / 30;
        int finalDays = remainingDays % 30;
        
        System.out.println("You are: " + finalYears + " years, " + finalMonths + " months and " + finalDays + " days.");
        		
		sc.close();
	}

}
