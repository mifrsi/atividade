package atividade25042023;

import java.util.Scanner;

public class Exercicio7 {
	public static void main (String [] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Programa para descobrir regra de três: ");
		System.out.println("................");
		System.out.println("Digite o primeiro número");
		double numero1 = S.nextDouble();
		
		System.out.println("Digite o segundo número");
		double numero2 = S.nextDouble();
 
		System.out.println("Digite o trceiro número");
		double numero3 = S.nextDouble();
		
        double total = (numero2*numero3)/(numero1); 
        
        System.out.println(numero1 + " está para " + numero2 +  " assim como "  + numero3 + " está para " + total);
    }
}