package br.com.generation.plataforma;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		
		int n, impar;
		double par;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um n�mero: ");
		n = ler.nextInt();
		
		if (n % 2 == 1) {
			impar = n * n;
			System.out.println(n + " � um n�mero �mpar e o resultado elevado ao quadrado �: " + impar);
		}
		else if (n % 2 == 0) {
			par = Math.sqrt(n);
			System.out.println(n + " � um n�mero par e a sua raiz quadrada � " + par);
		}
			ler.close();
	}

}
