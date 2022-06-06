package teste2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		thr teste[] = new thr[3];
		for (int i = 0; i < teste.length; i++) {
			System.out.println("age?");
			int numIn = sc.nextInt();
			System.out.println("name?");
			String nameIn = sc.next();
			System.out.println("salary?");
			Double salaryIn = sc.nextDouble();
			teste[i] = new thr(numIn, nameIn, salaryIn);
		}
		for (int i = 0; i < teste.length; i++) {
			System.out.println(teste[i].lista());
		}
		System.out.println("quem vai ser zerado ?");
	int zero = sc.nextInt();
	teste[zero].zerar();
		System.out.println(teste[zero].lista());
		for (int i = 0; i < teste.length; i++) {
			System.out.println(teste[i].lista());
		}
	}

}
