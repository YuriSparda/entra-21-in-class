package texte;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			lista.add(i);
		}
		for (int x : lista) {
			System.out.println(x);
		}
		System.out.println(lista);

	}

}
