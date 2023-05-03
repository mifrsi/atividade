package atividade25042023;

import java.util.Scanner;

public class Exercicio6 {
	public static void main (String []args) {
		Scanner S = new Scanner(System.in);
		double numero1, numero2, numero3;
		System.out.println("Entre com um número");
		numero1 = S.nextDouble();
		
		System.out.println("Entre com outro número");
		numero2 = S.nextDouble();
		
		System.out.println("Entre com outro número");
		numero3 = S.nextDouble();
		
		double hipotenusa = numero1*numero1;
		
		System.out.println(hipotenusa=(numero2*numero2)+(numero3*numero3));
		
	
}
}