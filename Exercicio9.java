package atividade25042023;

import java.util.Scanner;

public class Exercicio9 {
	public static void main (String [] args) {
		Scanner S = new Scanner(System.in);
        double idade;
        String nome; 
        
        System.out.println("Escreve seu nome: ");
        nome = S.next();
        
        System.out.println("Escreve sua idade: ");
        idade = S.nextDouble();
        
        if (idade >18) {
        	System.out.println("Você é maior de idade");
        }else {
        	System.out.println("Você é menor de idade");
        	
        }

}
}