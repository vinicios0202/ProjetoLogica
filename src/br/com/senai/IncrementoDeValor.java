package br.com.senai;

import java.util.Scanner;

public class IncrementoDeValor {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int primeiroValor = tec.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		int segundoValor = tec.nextInt();
		
		if(primeiroValor < segundoValor) {
			while(primeiroValor <= segundoValor) {
				System.out.println(primeiroValor);
				primeiroValor++;
			}
		} else {
			while(primeiroValor >= segundoValor) {
				System.out.println(primeiroValor);
				primeiroValor--;
			}
		}
	}
}
