package semana4;

import java.util.Scanner;

public class exerc_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[50];
		while (true) {
			System.out.println(
					"1 Ц Incluir valor\n2 Ц Pesquisar valor\n3 Ц Alterar valor\n4 Ц Mostrar valores\n5 Ц Sair do sistema");
			int option = sc.nextInt();
			if (option > 5 && option < 0) {
				System.out.println("opзгo invalida");
			}
			if (option == 1) {
				System.out.println("em qual vetor deseja adicionar valor ?(1 a 50)");
				int vetAlt = sc.nextInt();
				if (vetAlt > 50 && vetAlt <= 0) {
					System.out.println("vetor invalido");
				}
				System.out.println("qual valor deseja adicionar ?");
				int numb = sc.nextInt();
				num[vetAlt - 1] = numb;
				System.out.println("valor adicionado");
			}
			if (option == 2) {
				System.out.println("qual vetor deseja pesquisar o valor?");
				int vetAlt = sc.nextInt();
				if (vetAlt > 50 && vetAlt <= 0) {
					System.out.println("vetor invalido");
				}
				System.out.println("valor desse vetor й " + num[vetAlt - 1]);
			}
			if (option == 3) {
				System.out.println("em qual vetor deseja alterar valor ?(1 a 50)");
				int vetAlt = sc.nextInt();
				if (vetAlt > 50 && vetAlt <= 0) {
					System.out.println("vetor invalido");
				}
				System.out.println("qual valor deseja substituir ?");
				int numb = sc.nextInt();
				num[vetAlt - 1] = numb;
				System.out.println("valor alterado");
			}
			if (option == 4) {System.out.println("mostrando valores.");
			int times = 0;
				for (int i = 0; i < num.length; i++) {times++;
					System.out.print("numero do vator "+(i+1)+" й "+num[i]+" | ");
					if (times==5) {System.out.print("\n");
						times=0;
						
					}
				}
			}
			if (option == 5) {System.out.println("encerrando");
			 break;
			}
		}

	}

}
