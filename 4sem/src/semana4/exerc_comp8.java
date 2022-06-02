package semana4;

import java.util.Scanner;

public class exerc_comp8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		boolean x, y, z;
		x = true;
		y = true;
		z = true;
		for (int i = 0; i < num.length; i++) {
			System.out.println("digite o numero da variavel " + (i + 1));
			num[i] = sc.nextInt();
		}
		System.out.println("deseja mudar algum numero digitado ?(y/n)");
		char say = sc.next().charAt(0);
		if (say == 'n') {
			x = false;
		} else {
		}
		while (x) {
			for (int i = 0; i < num.length; i++) {
				System.out.println("var ["+i+"] = "+num[i]);
			}
			System.out.println("qual numero deseja mudar ?");
			int cho= 0;
			cho =sc.nextInt();
			System.out.println("qual numero vai entrar nessa variavel?");
			num[cho]=sc.nextInt();
			System.out.println("mudar mais algum numero ?(y/n)");
			char say2 = sc.next().charAt(0);
			if (say2 == 'n') {
				x = false;
			}
		}for (int i = 0; i < num.length; i++) {
			System.out.println("var ["+i+"] = "+num[i]);
		}
	}

}
