import java.util.Scanner;

public class calc3 {

	public static void main(String[] args) {
		Scanner Imput = new Scanner(System.in);
		int numero, X;
		X = 10;
		System.out.println("digite o valor o qual vai estar junto na opreção com o 10");
		numero = Imput.nextInt();
		System.out.println("qual operação? 1=/; 2=*;3=-;4=+");
		int sinal = Imput.nextInt();
		if (sinal == 1) {
			numero /= X;
			System.out.println(numero);

		} else if (sinal == 2) {
			numero *= X;
			System.out.println(numero);

		} else if (sinal == 3) {
			numero -= X;
			System.out.println(numero);

		} else if (sinal == 4) {
			numero += X;
			System.out.println(numero);

		}

	}

}
