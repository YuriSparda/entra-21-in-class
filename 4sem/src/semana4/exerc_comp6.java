package semana4;

import java.util.Scanner;

public class exerc_comp6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("digite os numeros ");
		for (int i = 0; i < num.length; i++) {System.out.println("primeiro");
			num[i]=sc.nextInt();
		}for (int i = 0; i < num.length; i++) {
			System.out.println("numero = "+(i+1)+" é "+num[4-i]);
		}
	}

}
