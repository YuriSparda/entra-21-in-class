package texte;

import java.util.ArrayList;
import java.util.List;

public class arrayList3 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(1 * 2);
		lista.add(2 * 4);
		lista.add(4 * 8);
		lista.add(1 * 4);
		lista.add(9 * 4);
		lista.add(10 * 1);
		lista.add(1);

		int maiorNum = Integer.MIN_VALUE;
		int casaMaior = 0;
		int menorNum = Integer.MAX_VALUE;
		int casaMenor = 0;
		for (int i = 0; i <= 6; i++) {
			if (lista.get(i) > maiorNum) {
				maiorNum = lista.get(i);
				casaMaior = i;
			}
		}
		for (int i = 0; i <= 6; i++) {

			if (lista.get(i) < menorNum) {
				menorNum = lista.get(i);
				casaMenor = i;
			}
		}
		System.out.println("maior numero " + maiorNum + " encontra-se na casa " + casaMaior);
		System.out.println("menor numero " + menorNum + " encontra-se na casa " + casaMenor);

	}

}
