package br.com.generation.exerciciosportugol;

import java.util.Scanner;

public class Portugol3 {
	
	public static void main(String[] args) {
		
		int smin = 0, seg, horas, minutos, seg2 = 0;
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos segundos dura esse evento na fábrica? ");
		seg = ler.nextInt();
		
		minutos = seg / 60;
		horas = minutos / 60;
		if (minutos % (60*horas)  >= 1) {
			smin = minutos%(60*horas);
		}
		
		if (seg % 60 >= 1) {
			seg2 = seg%60;	
		}
		
		if (seg2 != 0 && smin != 0) {
			System.out.println("Esse evento dura " + horas + " horas, " + smin + " minutos e " + seg2 + "segundos");
		}
		
	ler.close();
	}
}
