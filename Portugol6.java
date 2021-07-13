package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Portugol6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x1, y1, x2, y2, p1, p2;
		double d;
		
		System.out.print("Valor x1: ");
		x1 = ler.nextInt();
		System.out.print("Valor y1: ");
		y1 = ler.nextInt();
		System.out.print("Valor x2: ");
		x2 = ler.nextInt();
		System.out.print("Valor y2: ");
		y2 = ler.nextInt(); 
		
		p1 = (x1 + y1)*2;
		p2 = (x2 + y2)*2;
		
		d = Math.sqrt(p1 + p2);
		
	ler.close();
		System.out.println(d);
	}

}
