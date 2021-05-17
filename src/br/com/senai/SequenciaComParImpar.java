package br.com.senai;

import java.util.Scanner;

public class SequenciaComParImpar {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int par = 0;
		int impar = 0;
		
		System.out.print("Informe o primeiro valor: ");
		int primeiroValor = tec.nextInt();

		System.out.print("Informe o segundo valor: ");
		int segundoValor = tec.nextInt();

		if (primeiroValor < segundoValor) {
			while (primeiroValor <= segundoValor) {
				System.out.println(primeiroValor);
				if(primeiroValor % 2 == 0) {
					par++;
				} else {
					impar++;
				}
				primeiroValor++;
			}
		} else {
			while (primeiroValor > segundoValor) {
				System.out.println(primeiroValor);
				if(primeiroValor % 2 == 0) {
					par++;
				} else {
					impar++;
				}
				primeiroValor--;
			}
		}
		System.out.println("Total de valores PARES: " + par);
		System.out.println("Total de valores IMPARES: " + impar);
	}
}
