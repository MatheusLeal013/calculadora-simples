package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Operacao;
import services.CalculadoraService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("CALCULADORA SIMPLES");
		System.out.print("Caso deseje prosseguir, digite 'C', caso não, digite qualquer coisa: ");
		char c = sc.next().charAt(0);

		while (c == 'C') {
			try {
				System.out.print("Insira o valor 1: ");
				int num1 = sc.nextInt();
				System.out.print("Insira o valor 2: ");
				int num2 = sc.nextInt();
				System.out.print("Digite a operacao que deseja realizar: ");
				char operador = sc.next().charAt(0);

				while (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
					System.out.println("ERROR! Operador invalido. Por favor, insira a operacao novamente");
					System.out.print("Insira o valor 1: ");
					num1 = sc.nextInt();
					System.out.print("Insira o valor 2: ");
					num2 = sc.nextInt();
					System.out.print("Digite a operacao que deseja realizar: ");
					operador = sc.next().charAt(0);
				}

				Operacao operacao = new Operacao(num1, num2, operador);

				CalculadoraService calculadoraService = new CalculadoraService();

				System.out.println("Resultado " + calculadoraService.calculo(operacao));

				System.out.print("Digite 'C' para relizar outra operacao, ou digite qualquer coisa para encerrar: ");
				c = sc.next().charAt(0);
				
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Valor inserido nao e valido");
			} catch (ArithmeticException e) {
				System.out.println("ERROR: Divisão por 0 nao e permitida");
			}
		}
		sc.close();
	}

}
