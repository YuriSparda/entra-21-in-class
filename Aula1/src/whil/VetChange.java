package whil;

import java.util.Scanner;

public class VetChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		char resp;
		for (int i = 0; i < num.length; i++) {
			num[i] = i;

		}
		System.out.println("numeros atuais");
		for (int i = 0; i < num.length; i++) {
			System.out.println("vetor " + i + " num armazenado " + num[i]);
		}
		System.out.println("qual vetor deseja atlterar?");
		int C = sc.nextInt();
		do {
			if (C == 0) {
				System.out.println("qual numero vai ser esse vetor?");
				int alt = sc.nextInt();
				num[0] = alt;
			}
			if (C == 1) {
				System.out.println("qual numero vai ser esse vetor?");
				int alt = sc.nextInt();
				num[1] = alt;
			}
			if (C == 2) {
				System.out.println("qual numero vai ser esse vetor?");
				int alt = sc.nextInt();
				num[2] = alt;
			}
			if (C == 3) {
				System.out.println("qual numero vai ser esse vetor?");
				int alt = sc.nextInt();
				num[3] = alt;
			}
			if (C == 4) {
				System.out.println("qual numero vai ser esse vetor?");
				int alt = sc.nextInt();
				num[4] = alt;
			}
			System.out.println("alterar outro vetor?(Y/N)");
			resp = sc.next().charAt(0);
			if (resp == 'n') {
				for (int i = 0; i < num.length; i++) {
					System.out.println("vetor " + i + " num armazenado " + num[i]);
				}
				break;
			}
		} while (resp != 'n');
	}

}
