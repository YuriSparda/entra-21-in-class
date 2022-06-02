package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Calc;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calc Apply = new Calc();
		System.out.print("nome: ");
		Apply.name = sc.nextLine();
		System.out.print("salario bruto: ");
		Apply.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		Apply.tax = sc.nextDouble();
		System.out.println();
		System.out.println("liquido: " + Apply);
		System.out.println();
		System.out.print("qual porcentagem vai acrescentar no salario ? ");
		double percentage = sc.nextDouble();
		Apply.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + Apply);
		sc.close();
	}
}