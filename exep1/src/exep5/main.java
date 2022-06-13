package exep5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num[] = new double[5];
		for (int i = 0; i < num.length; i++) {
			System.out.println("digite um numero para o vetor "+i);
			num[i]=sc.nextDouble();
			
		}
		System.out.println("qual vetor vc deseja editar ?");
		int numI=sc.nextInt();
		if (numI<=-1 || numI>=5) {
			throw new IllegalArgumentException("erro , vetor invalido");
		}
		num[numI]=sc.nextDouble();
		System.out.println("atualmente o vetor "+numI+" é igual ao valor "+num[numI]);
	}

}
