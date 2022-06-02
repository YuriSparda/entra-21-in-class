package semana4;

import java.util.Scanner;

public class exerc_comp7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int numD;
		num[0] = 16;
		num[1] = 11;
		num[2] = 9;
		num[3] = 7;
		num[4] = 5;
		boolean x = true;
		while (x) {
			numD = 0;
			System.out.println("digite um numero");
			numD = sc.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (numD == num[i]) {
					System.out.println("acertou!!");
					x = false;
					break;
				}

			}
		}
	}

}
