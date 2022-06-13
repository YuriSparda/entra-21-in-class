package exep4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura[] = new double[5];
		double calc = 0;
		for (int i = 0; i < altura.length; i++) {
			System.out.println("digite a altura(Metros com virgula) da pessoa " + (i + 1));
			altura[i] = sc.nextDouble();
			calc += altura[i];
			if (altura[i] <= 0) {
				throw new IllegalArgumentException("altura menor ou igual a 0 , altura invalida");
			}

		}

		System.out.println("altura media " + (calc / 5));
	}

}
