package controller;

import java.util.ArrayList;

import java.util.Scanner;

/*
1. Criar uma classe Java que recebe uma lista de valores, gera um n�mero sequencial para cada valor (iniciando em 1) e devolve uma String com os sequencias inteiros concatenados a um texto e ao seu respectivo valor. Ao final, apresentar o total da soma dos valores.
Exemplo:
Dado de entrada: Arrays.asList(88.00, 130.00, 54.90, 293.30, 44.80)
Retorno esperado: "Remessa gerada: 1 cujo valor � R$ 88,00, 2 cujo valor � R$ 130,00, 3 cujo valor � R$ 54,90, 4 cujo valor � R$ 293,30 e 5 cujo valor � R$ 44,80. Total = 611,00."
B�nus:
Implementa��o de testes unit�rios.
README descrevendo o uso do sistema.*/

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			ArrayList<String> lista = new ArrayList<String>();
			
			
			
			System.out.println("Informe o tamanho da lista");
			int i = sc.nextInt();
			
			System.out.println("Informe os valores da lista ");
			
			//la�o que adiciona os valores em uma lista
			for(int x=0; x < i; x++) {
				lista.add(sc.next());
				
			}
			
			System.out.println("Remessa gerada:");
			
			// la�o que concatena os valores informados na lista 
			for(int x=0; x < lista.size(); x++) {
				int a= x + 1;
				System.out.println( + a + " cujo valor R$" +lista.get(x) );
			}
			
			
			float val= 0;
			
			//Realiza o calculo do total 
			for(int x=0; x < lista.size(); x++) {
 				
				val = val + Float.valueOf(lista.get(x)).floatValue();
				
			}
			System.out.println("Total: R$" + val  );
			
			sc.close();
	}
}
