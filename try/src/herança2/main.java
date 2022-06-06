package herança2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cilindro calc = new cilindro(null, 0.0, 0.0);
		System.out.print("digite o valor do raio :");
		calc.setRaio(sc.nextDouble());
		System.out.print("die a altura :");
		calc.setAltura(sc.nextDouble());
		System.out.println("qual a cor desse cilindro?");
		calc.setCor(sc.next());

		System.out.println(calc.dados());

	}

}
