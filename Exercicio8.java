package atividade25042023;

import java.util.Scanner;

public class Exercicio8 {
	public static void main (String []args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = S.nextLine();
		
		System.out.println("Digite data de nascimento: ");
		try {
			
		String	datarecebida = S.nextLine();
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		Date dt = df.parse(datarecebida);
		System.out.println(dt);
	
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Digite nota1: ");
		double nota1 = S.nextDouble();
		
		System.out.println("Digite nota2: ");
		double nota2 = S.nextDouble(); 
		
	}
	
		double media = (nota1 + nota2)/2;
		
		System.out.println(" Você se chama " +nome+ " nasceu no dia " +dt+ " sua nota é: " +media);
  }



