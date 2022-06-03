package herança1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalWorker = 0;
		int totalBoss = 0;
		ArrayList<worker> trabalhador = new ArrayList<>();
		ArrayList<boss> BOSS = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("digite o nome");
			String name = sc.next();
			System.out.println("digite salario");
			double sal = sc.nextDouble();
			System.out.println("esse funcionario é um chefe ou um trabalhador comum ?");
			String verify = sc.next();
			if (verify.equals("chefe")) {
				totalBoss += 1;
				boss chefe = new boss(name, sal, i, (totalWorker/totalBoss));
				BOSS.add(chefe);
			} else {
				totalWorker += 1;
				worker func = new worker(name, sal, i, null, "ID worker null");
				trabalhador.add(func);
			}

		}



	}

}
