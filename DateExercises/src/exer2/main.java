package exer2;

import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		age pl[] = new age[3];
		for (int i = 0; i < pl.length; i++) {
			pl[i] = new age(null, null);
			System.out.println("nome ?");
			pl[i].setName(sc.next());
			System.out.println("digite o ano de nascimento \n YYYY/MM/DD");
			int yy = sc.nextInt();
			int mm = sc.nextInt();
			int dd = sc.nextInt();
			pl[i].setDate(LocalDate.of(yy, mm, dd));

			System.out.println("pessoa " + i + " finalizada:");
		}

	
	
	}

}
