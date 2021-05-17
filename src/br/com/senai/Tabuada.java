package br.com.senai;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int multiplicador = 0;
		
		System.out.print("Informe um valor: ");
		int valor = tec.nextInt();
		
		while(multiplicador <= 10) {
			System.out.println(valor + " x " + multiplicador + " = " + (valor * multiplicador));
			multiplicador++;
		}
	}
}
