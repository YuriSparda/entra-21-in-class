import java.util.Scanner;

public class cor {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("digite um numero");
		int numero = num.nextInt();

		if (numero > 0 & numero < 10) {
			System.out.println("cor vermelha");

		} else if (numero > 9 & numero < 20) {
			System.out.println("cor verde");

		} else if (numero > 19 & numero < 30) {
			System.out.println("cor azul");

		} else {
			System.out.println("cor invalida");
		}
	}

}
