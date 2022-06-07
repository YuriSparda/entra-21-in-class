package zoo;

import java.awt.Color;
import java.awt.Panel;
import java.awt.SystemColor;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.print("\033[31mERROR  \033[0m");
		Scanner sc = new Scanner(System.in);
		cats gatos = new cats(null, null, null, null, null, null, null);
		birds passaro = new birds(null, null, null, null, null, null, null);
		monkeys mamaco = new monkeys(null, null, null, null, null);

		Panel p = new Panel();
		p.setBackground(SystemColor.control);
		
		
		System.out.println("Digite a raça do animal\nOpções\n1=Gato Sekvagem\n2=aves silvestres\n3=Primatas");
		int d = sc.nextInt();
		if (d == 1) {
			System.out.println("gatos");
			gatos.setNameID(sc.next());
		} else if (d == 2) {
			System.out.println("bird");

		} else if (d == 3) {
			System.out.println("mamaco");

		} else if (d > 3 && d < 1) {
			System.err.println("error tente novamente.");
		}

	}

}
