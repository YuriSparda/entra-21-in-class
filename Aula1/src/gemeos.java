import java.util.Scanner;

public class gemeos {

	public static void main(String[] args) {
		Scanner Age = new Scanner(System.in);
		int irmão1, irmão2, irmão3;
		System.out.println("digite a idade do primeiro irmão");
		irmão1 = Age.nextInt();
		System.out.println("digite a idade do segundo irmão");
		irmão2 = Age.nextInt();
		System.out.println("digite a idade do terceiro irmão");
		irmão3 = Age.nextInt();
		if (irmão1 == irmão2 && irmão1 == irmão3 ) {
			System.out.println("trigemeos");

		} else if (irmão1 == irmão2) {
			System.out.println("irmão 1 e irmão 2 são gemeos");

		} else if (irmão2 == irmão3) {
			System.out.println("irmão 2 e irmão 3 são gemeos");

		} else if (irmão1 == irmão3) {
			System.out.println("irmão 1 e irmão 3 são gemeos");
			
		} else {
			System.out.println("nenhum irmão é gemeo");

		}

	}

}
