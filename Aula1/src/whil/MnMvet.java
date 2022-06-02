package whil;

import java.util.Scanner;

public class MnMvet {

	public static void main(String[] args) {
		// metodo de calcular a media dos elementos , e descorbrir o maior e o menor.
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		for (int i = 1; i < num.length; i++) {
			System.out.println("digite um numero");
			num[i]=sc.nextInt();
			
		}if (num[1]>num[2]&&num[1]>num[3]&&num[1]>num[4]&&num[1]>num[6]) {
			int total = num[1]+num[2]+num[3]+num[4]+num[6]/5;
			System.out.println(total);
		}
	}

}
