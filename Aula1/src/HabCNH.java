import java.util.Scanner;

public class HabCNH {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		Scanner agree = new Scanner(System.in);
		int idade;
		idade = age.nextInt();
		System.out.println("possui permissão judicial ? true/false");
		Boolean permissãoJudicial = agree.nextBoolean();

		if (idade > 17) {
			System.out.println("permissão para tirar CNH");
		} else if (permissãoJudicial == true) {
			System.out.println("permissão judicial aprovada para tirar CNH");
		} else {
			System.out.println("não pode tirar CNH");
		}

	}

}
