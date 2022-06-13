package exep6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			System.out.println("digite um numero para o vetor " + i);
			num.add(sc.nextInt());

		}
		System.out.println("qual vetor vc deseja editar ?");
		int numI = sc.nextInt();
		if (numI <= -1 || numI >= 5) {
			throw new IllegalArgumentException("erro , ArrayList invalido");
		}
		num.set(numI, sc.nextInt());
		System.out.println("atualmente o vetor " + numI + " é igual ao valor " + num.get(numI));

	}

}
