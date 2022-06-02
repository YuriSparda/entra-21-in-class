package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o primeiro numero");
		int num1 = sc.nextInt();
		System.out.println("digite o segundo numero");
		int num2 = sc.nextInt();
		diferença(num1,num2);
	}

	public static void diferença(int num1, int num2) {
		if (num1 == 5) {
			System.out.println("numero 1 é igual a 5");

		} else if (num2 == 5) {
			System.out.println("numero 1 é igual a 5");

		} else if (num1 - num2 == 5) {
			System.out.println("a diferença dos 2 numeros é igual a 5");

		} else if (num1 + num2 == 5) {
			System.out.println("a soma dos 2 é igual a 5");

		} else {
			System.out.println("nenhum dos numeros entra nas funções.");
		}
	}

}
