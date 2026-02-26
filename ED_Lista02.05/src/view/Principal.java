/*
 * Fazer uma função recursiva que receba 2 números inteiros positivos e 
 * apresente o MDC desses números. 
 */

package view;

import java.util.Scanner;

import controller.MDC;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da Classe MDC
		MDC metodo = new MDC();
		
		// Criando o método de leitura com Scanner
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Digite o primeiro número que deseja calcular o MDC: ");
		num1 = Integer.parseInt(ler.nextLine());
		
		System.out.print("Digite o segundo número que deseja calcular o MDC: ");
		num2 = Integer.parseInt(ler.nextLine());
		
		System.out.println("O MDC de "+num1+" e "+num2+" é: "+metodo.calcular(num1, num2));
		
		ler.close();
	}

}
