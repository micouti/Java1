package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaColletions {

			public static void main(String[] args) {
				Scanner ler = new Scanner(System.in);

				ArrayList<Collections1> produtos = new ArrayList<>();

				System.out.println("Quantos produtos você quer add: ");
				int numProd = ler.nextInt();
				int i;

				for (i = 0; i < numProd; i++) {
					System.out.print("Nome e ");
					String nomeProd = ler.nextLine();
					
					System.out.println("marca do Produto: ");
					String marcaProd = ler.nextLine();
					

					System.out.println("Valor do Produto: ");
					double valorProd = ler.nextDouble();
					

					produtos.add(new Collections1(nomeProd, marcaProd, valorProd));

				}
				for (Collections1 u : produtos) {
					System.out.println(u);
				}

				int resposta;
				do {
					System.out.println();
					System.out.println("Deseja remover um item? \n 1-Sim | 2-Não");
					resposta = ler.nextInt();
					if (resposta == 1) {
						System.out.println();
						System.out.println("Selecione o indice do produto: ");
						i = ler.nextInt();
						produtos.get(i);
						produtos.remove(i - 1);
						for (i = 0; i < produtos.size(); i++) {
							System.out.println(produtos.get(i));
						}
					}

				} while (resposta == 1);
				System.out.println("Programa finalizado");
	ler.close();			
	}

}
	




