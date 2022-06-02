package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pessoas script = new pessoas();
		for (int i = 0; i < 2; i++) {
			System.out.print("nome ? ");
			script.name[i] = sc.next();
			System.out.println("data de nascimento ? (DD/MM/AAAA)");
			System.out.print("dia : ");
			script.dia[i] = sc.nextInt();
			System.out.println("mes : ");
			script.mes[i] = sc.nextInt();
			System.out.println("ano : ");
			script.ano[i] = sc.nextInt();
			System.out.println("estado civil ?");
			script.estadoCivil[i] = sc.next();
			System.out.println("sexo biologico?(F/M)");
			script.sexo[i] = sc.next().charAt(0);
		}

	}

}
