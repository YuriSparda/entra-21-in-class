import java.util.Scanner;

public class SalCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double calc, time, salary, ajust;
		System.out.println("Digite seu salario");
		salary = sc.nextDouble();
		System.out.println("digite seu tempo de trabalho");
		time = sc.nextDouble();
		if (time < 12) {
			System.out.println("re-ajuste de 5%");
			calc = salary * 0.05;
			System.out.printf("adicional ao seu salario é %.2f%n", calc);
			ajust = salary + calc;
			System.out.printf("total recebido %.2f%n",ajust);
		} else if (time > 12 && time < 49) {
			System.out.println("re-ajuste de 7%");
			calc = salary * 0.07;
			System.out.printf("adicional ao seu salario é %.2f%n", calc);
			ajust = salary + calc;
			System.out.printf("total recebido %.2f%n",ajust);
		} else {
			System.out.println("aposentado");
		}

	}

}
