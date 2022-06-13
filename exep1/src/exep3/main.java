package exep3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o primeiro numero");
		int num1=sc.nextInt();
		if (num1==0) {
			throw new IllegalArgumentException("impossivel divisão por 0");
		}if (num1>100) {
			throw new IllegalArgumentException("numero fora dos limites");
		}
		int num2=sc.nextInt();
		if (num2==0) {
			throw new IllegalArgumentException("impossivel divisão por 0");
		}if (num2>100) {
			throw new IllegalArgumentException("numero fora dos limites");
		}
		System.out.println("Resultado "+(num1/num2));
	}

}
