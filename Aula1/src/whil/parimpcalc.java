package whil;

import java.util.Scanner;

public class parimpcalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int impar ,calcimpar;
		int par ,calcpar;
		calcpar=0;
		calcimpar=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("digite o numero");
			int num =sc.nextInt();
			if (num%2==0) {System.out.println(num+ " é par");
				calcpar+=num;
			}else {
				System.out.println(num+" é impar");
				calcimpar+=num;
			}par=+calcpar;
			 impar=+calcimpar;
			System.out.println("par ="+par+"///impar ="+impar);
		}System.out.println("terminou");

	}

}
