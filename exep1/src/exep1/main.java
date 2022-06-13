package exep1;

import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano;
		dia = 0;
		mes = 0;
		ano = 0;
		boolean set = true;
		while (set) {
			System.out.println("digite o mes");
			int num = sc.nextInt();
			if (num >= 1 && num <= 12) {
				mes = num;
				break;
			} else {
				throw new IllegalArgumentException("o mes so vai de 1 a 12");
			}

		}
		while (set) {
			System.out.println("digite o ano");
			int num = sc.nextInt();
			if (num >= 1970 && num <= 2022) {
				ano = num;
				break;
			} else {
				throw new IllegalArgumentException("o ano so vai de 1970 a 2022");
			}

		}
		while (set) {
			System.out.println("digite o dia");
			int num = sc.nextInt();
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (num >= 1 && num <= 31) {
					dia = num;
					break;
				} else {
					throw new IllegalArgumentException("o mes so vai de 1 a 31");
				}

			} else if (mes == 2) {
				if (num >= 1 && num <= 28) {
					dia = num;
					break;
				} else {
					throw new IllegalArgumentException("o mes so vai de 1 a 28");
				}

			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (num >= 1 && num <= 31) {
					dia = num;
					break;
				} else {
					throw new IllegalArgumentException("o mes so vai de 1 a 30");
				}

			}
		}

		LocalDate date = LocalDate.of(ano, mes, dia);
	}

}
