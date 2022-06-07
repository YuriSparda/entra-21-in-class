package herança1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// ISSO QUE FOI FEITO EM CLASSE AI CANSEI E PARTI PARA RE FAZER EM CASA
		Scanner sc = new Scanner(System.in);
		ArrayList<worker> trabalhador = new ArrayList<>();
		int i = 0;
		boolean cont = true;
		while (cont) {
			System.out.println("digite o nome");
			String name = sc.next();
			System.out.println("digite salario");
			double Sal = sc.nextDouble();
			System.out.println("quantas horas o funcionario " + name + " trabalha por dia ?");
			double hoursPerDay = sc.nextDouble();
			System.out.println("dia de ingresso?");
			int date = sc.nextInt();
			worker func = new worker(name, Sal, date, hoursPerDay, i + 1);
			trabalhador.add(func);
			boolean cont2 = true;
			i++;
			while (cont2) {
				System.out.println("adicionar novo funcionario ? \n(Sim)   (Não)");
				String resp = sc.next();

				if (resp.equals("Não")) {
					cont = false;
					cont2 = false;

				} else if (resp.equals("Sim")) {
					cont2 = false;
				} else {
					System.out.println("tente novamente");
				}
			}
		}
		System.out.println("lista de trabalhadores");
		for (worker worker : trabalhador) {
			System.out.println(worker.dados());
		}
		boolean sind = true;

		while (sind) {
			System.out.println("algum funcionario deseja sair do sindicato ?\n (yes)   (no)");
			String resp = sc.next();
			if (resp.equals("no")) {
				sind = false;
			} else if (resp.equals("yes")) {
				System.out.println(
						"a baixo vai aparecer a lista de funcionarios. \nDigite o numero do sindicato do qual deseja sair.");
				for (worker x : trabalhador) {
					System.out.println(x.dados());

				}
				int choice = sc.nextInt();

			} else {
				System.out.println("erro na resposta.");
			}
		}

		boss chefe = new boss("alex", 3500.0, 11, 15);
		System.out.println(chefe.getDates());
		chefe.setDoubleSalary();
		System.out.println(chefe.getDates());
		System.out.println("digite o Sind id do funcionario que deve ser demitido");
		for (worker worker : trabalhador) {
			System.out.println(worker.dados());
		}
		int choice = sc.nextInt();
		for (worker worker : trabalhador) {
			System.out.println(worker.dados());
		}
	}

}
