import java.util.Scanner;

public class data2 {

	public static void main(String[] args) {
		Scanner Day = new Scanner(System.in);
		Scanner month = new Scanner(System.in);
		int Data, mes;
		System.out.println("digite o dia");
		Data = Day.nextInt();
		System.out.println("didite o mes");
		mes = month.nextInt();

		if (mes > 0 & mes < 13 && Data > 0 & Data < 28) {
			System.out.println("dia valido");

		} else if (mes==5 && Data>0 & Data <30) {

		} else {System.out.println("data invalida");

		}
	}

}
