package texte;

import java.util.ArrayList;
import java.util.List;

public class arrayList4 {

	public static void main(String[] args) {
		List<Integer> list =  new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			list.add(i*i);
			System.out.println("["+i+"} = " + list.get(i));
		}
	}

}
