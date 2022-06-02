package whil;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o numero para o calculo");
		int fat = sc.nextInt();
		int result = fat;
		int i = 1;
		System.out.println("resultado");
		while (i<fat) {
			int calc = i*result;
			result = 1*calc;
			System.out.println(result);
			i++;
		}

	}

}
