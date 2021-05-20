package br.com.senai;

import java.util.Scanner;

public class AtividadeLogica {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String opcao = "s";
		int opcaoMenu;
		
		
		do {
			System.out.println("---MENU---");
			System.out.println("1� Verificar Sexo e Idade "); 
			System.out.println("2� Contagem de Valores ");
			System.out.println("3� Tabuada ");
			System.out.println("4� Cadastrar cursos ");
			System.out.println("5� Sair ");
			System.out.println("-------------------");
			System.out.print("Informe a op��o desejada: ");
			opcaoMenu = tec.nextInt();
			
			switch (opcaoMenu) {
			case 1:
				System.out.println("--- Verificar Sexo e Idade ---");
				int idade;
				int AnoDeNascimento;
				String nome;
				String sexo = "m";
				
				System.out.println("Infome o seu nome. ");
				nome = tec.next();
				System.out.println("Informe seu ano de Nascimento. ");
				idade = 2021 - tec.nextInt();			
				
				
				System.out.println("Informe seu Sexo [m/f]: ");
				sexo = tec.next();
				
				System.out.print("Seu nome � " + nome);
				if (sexo.equals("m")) {
					System.out.print(" Voc� � do sexo Masculino,");
				}
				
				if (!sexo.equals("m")) {
					System.out.print(" Voc� � do sexo Feminino,");
				 }
					
				if(idade < 12) {
					System.out.println(" Voc� � Crian�a, N�o pode votar, e ainda n�o pode tirar habilita��o. ");
				}
				if(idade > 12 && idade < 18) {
					System.out.println(" Voc� � Jovem, Seu voto � Opcional, e ainda n�o pode tirar habilita��o. ");
				}
				if(idade > 18 && idade < 65) {
					System.out.println(" Voc� � Adulto, Seu Voto � obrigat�rio, e ja pode tirar habilita��o. ");
				}
				if(idade > 65) {
					System.out.println(" Voc� � Idoso, Seu voto � Opcional, e ja pode tirar habilita��o. ");
				}
				break;
				
			case 2:
				System.out.println("--- Contagem de Valores ---");
				
				System.out.print("Informe o primeiro valor: ");
				int primeiroValor = tec.nextInt();
				System.out.print("Informe o segundo valor: ");
				int segundoValor = tec.nextInt();
				
				if(primeiroValor < segundoValor) {
					while(primeiroValor <= segundoValor) {
						System.out.println(primeiroValor);
						primeiroValor++;
					}
				}if(primeiroValor > segundoValor) {
					while(segundoValor <= primeiroValor) {
						System.out.println(segundoValor);
						segundoValor++;
					}
				}else {
					while(primeiroValor == segundoValor) {
						System.out.println("Valor igual ao primeiro, imposs�vel imprimir a sequ�ncia");
						primeiroValor--;
					}
				}
				
				break;
			
			case 3:
				System.out.println("--- Tabuada ---");
				
				int Valor;
				
				System.out.println("Informe o Valor");
				Valor = tec.nextInt();
				
				for(int i = 0; i <= 10; i++) {
					System.out.println(Valor + " x " + i + " = " +(Valor * i));
				}
				
				break;
				
			case 4:
				System.out.println("--- Cadastrar Cursos ---");
				String cursos[] = {"Usinagem", "TI", "ADM", "Letras", "Mec�nica"};
				String inserirCursos;
				
				String addNovo = "s";
				do {
					System.out.println("Informe o index do vetor: ");
					for(int i = 0; i < cursos.length; i++) {
						
						System.out.print(i + " | ");
						
						}
					System.out.println("-> ");
					int index = tec.nextInt();
					System.out.println("Informe a idade: ");
					cursos[index] = tec.next();
					
					System.out.println("Deseja informar uma nova idade: [s/n]: ");
					addNovo = tec.next();
					
				}while(addNovo.equals("s"));
				
				break;
			
			case 5:
				opcao = "n";
				break;
				
			default:
				System.out.println("Op��o Invalida");
				break;
				
			}
			
		} while (opcao.equalsIgnoreCase("s"));
		
		System.out.println("Sistema Encerrado. ");
				
			
			
			
			
			
			
		}

	}


