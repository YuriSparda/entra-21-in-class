import java.time.LocalDate;
import java.util.Scanner;

public class date1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		date2 people[] = new date2[2];
		for (int i = 0; i < people.length; i++) {
			people[i] = new date2(0, null, null, null);
			System.out.print("Digite o nome : ");
			people[i].setName(sc.next());
			System.out.print("Digite a idade: ");
			people[i].setAge(sc.nextInt());
			System.out.print("Digite M para masculino ///// F para feminino ");
			people[i].setSex(sc.next().charAt(0));

			System.out.println("digite o ano de nascimento");
			int yy = sc.nextInt();
			System.out.println("digite o mes de nascimento");
			int MM = sc.nextInt();
			System.out.println("Digite o dia");
			int dd = sc.nextInt();
			LocalDate data = LocalDate.of(yy, MM, dd);
			people[i].setDate(data);

		}
		for (date2 x : people) {
			System.out.println(x.lista());
		}

	}

}
