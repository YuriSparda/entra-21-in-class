package whil;

import java.util.Scanner;

public class MvalM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, i;
		System.out.println("Digite o valor 1");
		a = sc.nextInt();
		System.out.println("Digite o valor 2");
		i = sc.nextInt();
		if (a > i) {
			for (int j = i; j < a; j++) {System.out.println("a="+a+" maior que i="+i);
				System.out.println(j + " " + a + " - ");

			}

		} else if (i > a) {System.out.println("i="+i+" maior que a="+a);
			for (int j = a; j < i; j++) {
				System.out.println(j + " " + i + " - ");

			}
		}

	}

}
