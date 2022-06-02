import java.util.Scanner;

public class scanTest {

	public static void main(String[] args) {
		Scanner Txt = new Scanner(System.in);
		int A, L, area, perimetro;
		System.out.println("digite primeiro o valor de Altura e em seguida de largura");
		A = Txt.nextInt();
		System.out.println("Altura=" + A);
		L = Txt.nextInt();
		System.out.println("Lagura=" + L);
		area = L * A;
		perimetro = (L * 2) + (A * 2);
		System.out.println("area=" + area + "\nperimetro=" + perimetro);

	}

}
