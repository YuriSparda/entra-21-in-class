import java.util.Scanner;

public class gemeos {

	public static void main(String[] args) {
		Scanner Age = new Scanner(System.in);
		int irm�o1, irm�o2, irm�o3;
		System.out.println("digite a idade do primeiro irm�o");
		irm�o1 = Age.nextInt();
		System.out.println("digite a idade do segundo irm�o");
		irm�o2 = Age.nextInt();
		System.out.println("digite a idade do terceiro irm�o");
		irm�o3 = Age.nextInt();
		if (irm�o1 == irm�o2 && irm�o1 == irm�o3 ) {
			System.out.println("trigemeos");

		} else if (irm�o1 == irm�o2) {
			System.out.println("irm�o 1 e irm�o 2 s�o gemeos");

		} else if (irm�o2 == irm�o3) {
			System.out.println("irm�o 2 e irm�o 3 s�o gemeos");

		} else if (irm�o1 == irm�o3) {
			System.out.println("irm�o 1 e irm�o 3 s�o gemeos");
			
		} else {
			System.out.println("nenhum irm�o � gemeo");

		}

	}

}
