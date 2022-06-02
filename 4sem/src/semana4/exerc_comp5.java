package semana4;

import java.util.Scanner;

public class exerc_comp5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("digite o numero para ser identificado");
			num=sc.nextInt();
			if (num %2==0) {
				System.out.println("par");
			}else {
				System.out.println("impar");
			}
			
		}
	}

}
