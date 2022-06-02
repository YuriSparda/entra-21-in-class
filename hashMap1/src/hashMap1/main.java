package hashMap1;

import java.util.HashMap;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		boolean veri = true;
		for (int i = 0; i < 3; i++) {
			System.out.println("digite o n ");
			int x = sc.nextInt();
			if (x % 2 == 0) {
				String y = "par";
				mapa.put(x, y);
			}else {
				String y = "impar";
				mapa.put(x, y);
			}
		}
			System.out.println(mapa);

	}

}
