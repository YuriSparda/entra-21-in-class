import java.util.Scanner;

public class Points {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double Score1, Score2, Score3, Score4, endScore;
		System.out.println("digite a nota da primeira prova");
		Score1 = sc.nextDouble();
		System.out.println("digite o resultado da segunda avaliação");
		Score2 = sc.nextDouble();
		System.out.println("digite o resultado da segunda avaliação");
		Score3 = sc.nextDouble();
		System.out.println("digite o resultado da segunda avaliação");
		Score4 = sc.nextDouble();
		endScore = (Score1 + (Score2 * 2) + (Score3 * 3) + Score4) / 7;
		if (endScore >= 9) {
			System.out.println("nota A n/ aprovado");

		} else if (endScore >= 7.5 && endScore < 9) {
			System.out.println("nota B");

		} else if (endScore >= 6 && endScore < 7.5) {
			System.out.println("C");

		} else if (endScore >= 4.0 && endScore < 6) {
			System.out.println("D");

		} else if (endScore < 4 && endScore >= 0) {
			System.out.println("reprovado");

		} else {
			System.out.println("nota invalida");

		}

	}
}