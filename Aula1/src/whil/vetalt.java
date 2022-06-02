package whil;

import java.util.Scanner;

public class vetalt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o numero de vezes");
		int times = sc.nextInt();
		int num[] = new int[times];
		int numR[] = new int[times];
		for (int i = 0; i < times; i++) {
			System.out.println("digite o numero " + (i + 1));
			num[i] = sc.nextInt();
			System.out.println((i + 1) + "° posição  é " + num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			int j = num[i];

			System.out.println("numero " + num[i] + " digitado na posição " + (i + 1));

		}

	}

}
