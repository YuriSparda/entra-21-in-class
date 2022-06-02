import java.util.Scanner;

public class Truco {

	public static void main(String[] args) {
		Scanner card = new Scanner(System.in);
		System.out.println("sabendo que o valor 1 = AS ,2=2,3=3,7=7,11=Valente,12=Dama,13=Rei");
		System.out.println("digite o valor da carta 1");
		int carta1 = card.nextInt();
		System.out.println("digite o valor da carta 2");
		int carta2 = card.nextInt();
		System.out.println("digite o valor da carta 3");
		int carta3 = card.nextInt();
		if (carta1 > 0 && carta1 < 4 && carta2 > 0 & carta2 < 4 && carta3 > 0 && carta3 < 4) {
			System.out.println("NOVE!!!!");
		} else if (carta1 > 0 & carta1 < 4 && carta2 > 0 & carta2 < 4
				|| carta3 > 0 && carta3 < 4 && carta2 > 0 & carta2 < 4) {
			System.out.println("SEIS!!!!");
		} else if (carta1 > 0 && carta1 < 4 || carta2 > 0 & carta2 < 4 || carta3 > 0 && carta3 < 4) {
			System.out.println("TRUCO!!!!");
		} else {
			System.out.println("invalido");

		}

	}

}
