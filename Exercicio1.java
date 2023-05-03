package atividade25042023;

import java.util.Scanner;

public class Exercicio1 {
	public static void main (String []args) {
		Scanner S = new Scanner(System.in);
		double numero1, numero2;
		System.out.println("Entre com um número");
		numero1 = S.nextDouble();
		
		System.out.println("Entre com um número");
		numero2 = S.nextDouble();
		
		System.out.println(numero1*numero2);
  }
}