import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);
		int F1, F2, F3;
		System.out.println("digite a idade do Marquinhos");
		F1 = age.nextInt();
		System.out.println("digite a idade do Zezinho");
		F2 = age.nextInt();
		System.out.println("digite a idade da Luluzinha");
		F3 = age.nextInt();

		if (F1<F2 && F2<F3) {
			System.out.println("Luluzinha mais velha,Zezinho do meio e Marquinhos o Caçula");
		} else if (F1<F3 && F3<F2) {
			System.out.println("Zezinho mais velho, Luluzinha do meio e Marquinhos o Caçula");
		} else if (F3<F2 && F2<F1) {
			System.out.println("Marquinhos mais velho, Zezinho do meio e Luluzinha a Caçula");
		}else if (F2<F1 && F1<F3) {
			System.out.println("Luluzinha mais velha, Marquinhos do meio e Zezinho o Caçula");
		} else if (F2<F3 && F3<F1) {
			System.out.println("Marquinhos mais velo, Luluzinha do meio e Zezinho o Caçula");
		}else if (F3<F1 && F1<F2) {
			System.out.println("Zezinho mais velho, Marquinhos o do meio e Luluzinha a Caçula");
		}

	}

}
