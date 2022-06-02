package semana4;

import java.util.Scanner;

public class exerc_media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int points[] = new int[3];
		int vezes = 0;
		String name[] = new String[10];
		while (true) {
			System.out.println("aluno?");
			name[vezes] = sc.next();
			if (name[vezes] == "fim") {
				System.out.println("encerrando.");
				break;
			}
			for (int i = 0; i < points.length; i++) {
				System.out.println((i + 1) + "° nota do aluno " + name[vezes]);
				points[i] = sc.nextInt();
			}
			System.out.println("media do aluno " + name[vezes] + " é " + ((points[0] + points[1] + points[2]) / 3));

		}
	}

}
