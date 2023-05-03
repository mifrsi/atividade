package atividade25042023;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String []args) {
		Scanner S = new Scanner(System.in);
		Integer ano_nascimento;
		String nome;
		
		System.out.println("Digite seu nome");
	      nome = S.next();
		
		System.out.println("Digite o ano de nascimento");
	     ano_nascimento = S.nextInt ();
		Integer idade = 2023-ano_nascimento;      
		
		System.out.println(2023-ano_nascimento);
		
  } 
}