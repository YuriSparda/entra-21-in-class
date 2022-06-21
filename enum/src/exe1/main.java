package exe1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("escolha o ddd para ver o pais;");
			System.out.println("opções 55 , 1 , 52 , 53");
			int imput = sc.nextInt();
			switch (imput) {
			case 55:
				System.out.println(enuMM.BRASIL);
				break;
			case 1:

				System.out.println(enuMM.CANADÁ);
				break;
			case 52:

				System.out.println(enuMM.MÉXICO);
				break;
			case 53:

				System.out.println(enuMM.CUBA);
				break;

			default:
				System.err.println("ERROR PAIS INVALIDO");
				break;
			}
		}
	}
}
