package herança1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<worker>trabalhador = new ArrayList<>();
		for (int i = 0; i < 5; i++) {System.out.println("digite o nome");
			String name = sc.next();
			System.out.println("digite salario");
		double Sal=sc.nextDouble();
		
			worker func=new worker(name, Sal, i, null, "ID worker null");
			trabalhador.add(func);
		}
		

		ArrayList<boss>BOSS = new ArrayList<>();
		boss chefe = new boss(null, null, 0, 0);
	}

}
