import java.util.Scanner;

public class CalcHS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double total, calc, time, salary, ajust, payHours;
		System.out.println("Digite seu salario");
		salary = sc.nextDouble();
		System.out.println("digite seu tempo de trabalho");
		time = sc.nextDouble();
		if (time > 40) {
			System.out.println("extra de 50%");
			payHours = salary / 40;
			calc = payHours * 0.5;
			System.out.printf("adicional ao seu salario é %.2f por hora%n", calc);
			ajust = payHours + calc;
			System.out.printf("total recebido por hora %.2f%n", ajust);
			total = ajust * time;
			System.out.printf("total recebido %.2f",total);
		} else {
			System.out.println("sem ajuste");
		}

	}

}
