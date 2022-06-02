package semana4;

import java.util.Scanner;

public class exerc_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num[]=new double[6];
		for (int i = 0; i < num.length; i++) {
			System.out.println("digite o valor do vetor "+i);
			num[i]=sc.nextDouble();	
		}	double x = (num[1] +num[0]+num[2]+num[3]+num[4]+num[5])/6;
		System.out.println("media = "+x);
		for (int i = 0; i < num.length; i++) {
			if (x<=num[i]) {System.out.println("valor "+i+" maior que a media e igual a "+num[i]);
				
			}
		}
	}

}
