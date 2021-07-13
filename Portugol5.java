package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Portugol5 {

	public static void main(String[] args) {
		double n1, n2, n3, media, soma;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota: ");
		n1 = ler.nextDouble();
		
		System.out.println("Digite a 2° nota: ");
		n2 = ler.nextDouble();
		
		System.out.println("Digite a 3° nota: ");
		n3 = ler.nextDouble();
		
		soma = n1 + n2 + n3;
		media = soma / 3;
		
		System.out.printf("A média do aluno é %.2f", media);
	ler.close();
	}

}
