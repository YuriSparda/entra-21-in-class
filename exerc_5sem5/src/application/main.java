package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		imposto per = new imposto();
		for (int i = 0; i < 5; i++) {
			System.out.print("digite o nome : ");
			per.name[i] = sc.next();
			System.out.print("digite o CPF (000.000.000-00) : ");
			per.CPF[i] = sc.next();
			System.out.print("digite o UF : ");
			per.UF[i] = sc.next();
			System.out.println("digite o salario bruto : ");
			per.renda[i] = sc.nextDouble();
		}
		System.out.println(per.Back());
		
		
	}

}
