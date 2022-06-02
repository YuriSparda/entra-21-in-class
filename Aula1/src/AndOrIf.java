import java.util.Scanner;

public class AndOrIf {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int num;
		num = number.nextInt();
		if (num < 0) {
			System.out.println("numero menor que zero");
		} else if (num>0) {
			System.out.println("numero maior que zero");
		} else {
			System.out.println("numero nulo");
		}

	}

}
