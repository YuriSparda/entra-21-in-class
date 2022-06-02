package whil;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade[] = new int[5];
		for (int i = 1; i < 6; i++) {
			System.out.println("digite a idade ");
			idade[i]= sc.nextInt();
			System.out.println("idade do " + i + " é " + idade[i]);
		}

	}

}
