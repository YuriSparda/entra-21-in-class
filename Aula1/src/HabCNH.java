import java.util.Scanner;

public class HabCNH {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		Scanner agree = new Scanner(System.in);
		int idade;
		idade = age.nextInt();
		System.out.println("possui permiss�o judicial ? true/false");
		Boolean permiss�oJudicial = agree.nextBoolean();

		if (idade > 17) {
			System.out.println("permiss�o para tirar CNH");
		} else if (permiss�oJudicial == true) {
			System.out.println("permiss�o judicial aprovada para tirar CNH");
		} else {
			System.out.println("n�o pode tirar CNH");
		}

	}

}
