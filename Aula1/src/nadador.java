import java.util.Scanner;

public class nadador {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		System.out.println("idade");
		int idade = age.nextInt();

		if (idade > 4 & idade < 8) {
			System.out.println("pré-mirin");
		} else if (idade > 7 & idade < 11) {
			System.out.println("mirin");
		} else if (idade > 10 & idade < 14) {
			System.out.println("infantil");
		} else if (idade > 13 & idade < 18) {
			System.out.println("infantil-juvenil");
		} else if (idade > 17 & idade < 21) {
			System.out.println("juvenil");
		} else if (idade > 20) {
			System.out.println("adultos");
		}
	}

}
