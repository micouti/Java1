package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Portugol2 {
	
	public static void main(String[] args) {
		
		int tot, dias, meses, anos;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite a sua idade em dias: ");
		tot = ler.nextInt();
		
		dias = 30;
		meses = 12;
		
		anos = (tot / dias) / meses;
		
		System.out.println("Você tem " + anos + " anos de idade");
		
		
		
		
		
	}

}
