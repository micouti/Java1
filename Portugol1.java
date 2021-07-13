package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Portugol1 {
	
	public static void main(String[] args) {
		
		int anos, meses, dias, anos1, anos2, anos3, tot;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a sua idade (anos): ");
		anos1 = ler.nextInt();
		System.out.println("E quantos meses: ");
		anos2 = ler.nextInt();
		System.out.println("E dias: ");
		anos3 = ler.nextInt();
		
		tot = anos1 * 7;
		meses = (anos1 * 12) + anos2;
		dias = (meses * 30) + anos3 + tot;
		
		System.out.println("O total de dias de vida é " + dias);
		
		
	}

}
