package semana4;

import java.util.Scanner;

public class Vatporc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num[] = new double[12];
		for (int i = 0; i < num.length; i++) {
			System.out.println("digite o valor do numero " + i);
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println("acumulativo de porcentagem");
			double j = 0;
			if ((num[i] % 2) == 0) {
				System.out.println(num[i] + " é par , acrescenta 2%");
				j = num[i] * 0.02;
				num[i] = num[i] + j;
				System.out.println(num[i]);
			} else 
				System.out.println(num[i] + " é par , acrescenta 5%");
				j = num[i] * 0.05;
			num[i] = num[i] + j;
			System.out.println(num[i]);
		}

	}

}
