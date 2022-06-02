package hashMap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> salario = new ArrayList<Double>();
		HashMap<Integer, String> work = new HashMap<Integer, String>();
		for (int i = 1; i <= 5; i++) {
			System.out.println("ID do funcionario : " + i);
			System.out.println("digite o nome do funcionario");
			String name = sc.next();
			System.out.println("digite o salario do funcionario " + name);
			double salary = sc.nextInt();
			work.put(i, name);
			salario.add(salary);
		}
		for (Double x : salario) {
			int i = 0;
			i++;
			System.out.printf("ID do funcionario %d \n nome é %s \n salario %.2f ", i, work.get(i), x);
		}

	}

}
