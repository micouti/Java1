package br.com.generation.plataforma;

import java.util.Scanner;

public class Exerc�cio2 {
	
	public static void main(String[] args) {
		
		int n1, n2, n3, mai, mai2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		n1 = ler.nextInt();
				
		System.out.println("Digite o 2� n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = ler.nextInt();
		
		if (n1 > n2 & n1 > n3) {
			mai = n1;
			System.out.println("O maior n�mero digitado foi o 1�: " + n1);
		}
		else if (n2 > n1 & n2 > n3) {
			mai = n2;
			System.out.println("O maior n�mero digitado foi o 2�: " + n2);		
		}
		else if (n3 > n1 & n3 > n2){
			mai = n3;
			System.out.println("O maior numero digitado foi o 3�: " + n3);	
		}
		else if (n1 == n2 & n1 == n3) {
			System.out.println("Os valores s�o iguais: " + n1);
		}
		
		if (n1 > n2 & n1 < n3) {
			mai = n1;
			System.out.println("O numero do meio foi o 1�: " + n1);
		}
		else if (n2 > n1 & n2 < n3) {
			mai = n2;
			System.out.println("O numero do meio foi o 2�: " + n2);		
		}
		else if (n3 > n1 & n3 < n2){
			mai = n3;
			System.out.println("O numero do meio foi o 3�: " + n3);
		}
		if (n1 < n2 & n1 < n3) {
			mai = n1;
			System.out.println("O menor n�mero digitado foi o 1�: " + n1);
		}
		else if (n2 < n1 & n2 < n3) {
			mai = n2;
			System.out.println("O menor n�mero digitado foi o 2�: " + n2);		
		}
		else if (n3 < n1 & n3 < n2){
			mai = n3;
			System.out.println("O menor numero digitado foi o 3�: " + n3);
		}
		ler.close();
	}

}
