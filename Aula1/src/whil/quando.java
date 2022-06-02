package whil;

import java.util.Scanner;

public class quando {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("lista de alunos." + "\ncom divisão por idade");
		int times = 100;
		int ageF[] = new int[times];
		int ID, numI;
		int many;
		numI = 0;
		ID = 0;
		String nImput;
		String nameUni[] = new String[times];
		String name1[] = new String[times];
		String name2[] = new String[times];
		String name3[] = new String[times];
		char resp;
		do {
			ID += 1;
			System.out.println("idade do " + ID + "° aluno");
			ageF[ID] = sc.nextInt();
			System.out.println("nome do " + ID + "°aluno");
			nImput = sc.next();
			if (ageF[ID] < 18) {
				System.out.println("adicionado a lista de menores de 18");
				name1[ID] = nImput;
				nameUni[ID] = nImput;
			}
			if (ageF[ID] > 17 && ageF[ID] < 21) {
				System.out.println("adicionado a lista entre 18 a 20 anos");
				name2[ID] = nImput;
				nameUni[ID] = nImput;
			}
			if (ageF[ID] > 20) {
				System.out.println("adicionado a lista de maiores de 20");
				name3[ID] = nImput;
				nameUni[ID] = nImput;
			}
			System.out.println("numero de alunos atualmente na turma =" + ID + "\nadicionar mais um aluno ?(Y/N)");
			resp = sc.next().charAt(0);
			if (resp == 'n') {
				break;
			}
			many = +times;
			times = times - (many - ID);
		} while (resp != 'n');
		System.out.println("lista de pronta");
		for (int i = times; i > 0; i--) {
			numI++;
			System.out.println(nameUni[numI] + " idade " + ageF[numI]);
		}

	}
}
