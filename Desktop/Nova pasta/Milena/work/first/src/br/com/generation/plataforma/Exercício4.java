package br.com.generation.plataforma;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		
		int n, impar;
		double par;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um número: ");
		n = ler.nextInt();
		
		if (n % 2 == 1) {
			impar = n * n;
			System.out.println(n + " é um número ímpar e o resultado elevado ao quadrado é: " + impar);
		}
		else if (n % 2 == 0) {
			par = Math.sqrt(n);
			System.out.println(n + " é um número par e a sua raiz quadrada é " + par);
		}
			ler.close();
	}

}
