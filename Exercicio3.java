package atividade25042023;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String []args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		String nome = S.next();
		System.out.println("Digite sua idade");
		int idade = S.nextInt();		
		System.out.printf("Meu nome é %s e tenho %d" ,nome,idade); 
	}
}
