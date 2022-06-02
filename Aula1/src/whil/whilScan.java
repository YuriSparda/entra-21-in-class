package whil;

import java.util.Scanner;

public class whilScan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limite, n1, n2, n3, n4, n5;
		System.out.println("digite 5 valores de 0 a 1000");
		System.out.println("valor 1");
		n1 = sc.nextInt();
		System.out.println("valor 2");
		n2 = sc.nextInt();
		System.out.println("valor 3");
		n3 = sc.nextInt();
		System.out.println("valor 4");
		n4 = sc.nextInt();
		System.out.println("valor 5");
		n5 = sc.nextInt();
		sc.close();
		for (int i = 0; i < 6; i++) {
			if (i == 1) {
				System.out.println("valor1 = " + n1);
			} else if (i == 2) {
				System.out.println("valor2 = " + n2);
			} else if (i == 3) {
				System.out.println("valor3 = " + n3);
			} else if (i == 4) {
				System.out.println("valor4 = " + n4);
			} else if (i == 5) {
				System.out.println("valor5 = " + n5);
			}

		}
	}

}
