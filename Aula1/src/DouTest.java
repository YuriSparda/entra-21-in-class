import java.util.Locale;
import java.util.Scanner;

public class DouTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double massa, altura, IMC;
		System.out.println("digite a massa");
		massa = sc.nextDouble();
		System.out.println("digite a altura");
		altura = sc.nextDouble();
		IMC = massa / (altura * altura);
		if (IMC <= 40) {
			System.out.println("Obesidade grau III(mordia) \nseu IMC é " +IMC);

		} else if (IMC <= 35 && IMC >= 39.9) {
			System.out.println("Obesidade grau II(severa)\nseu IMC é " +IMC);

		} else if (IMC <= 30 && IMC >= 34.9) {
			System.out.println("Obesidade Grau I\nseu IMC é " +IMC);

		} else if (IMC <= 25 && IMC >= 29.9) {
			System.out.println("Sobre peso\nseu IMC é " +IMC);

		} else if (IMC <= 18.5 && IMC >= 24.9) {
			System.out.println("Saudável \nseu IMC é " +IMC);

		} else if (IMC <= 18.5) {
			System.out.println("magreza \nseu IMC é " +IMC);
			
		}else if (IMC<=0) {System.out.println("graveto");
			
		}
	}

}
