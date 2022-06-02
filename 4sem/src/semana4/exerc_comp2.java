package semana4;

import java.util.Scanner;

public class exerc_comp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double altTotal,alt;
		altTotal=0;
		while (true) {System.out.println("digite a altura");
		alt=sc.nextDouble();
			if (alt==0) {System.out.println("terminou");
				break;
			}
			altTotal+=alt;
			System.out.println("altura total atualmente = "+altTotal);
		}

	}

}
