package semana4;

import java.util.Scanner;

public class exerc_comp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numTotal, inte, times, mNum, nNum;
		numTotal = 0;
		times = 0;
		mNum = 0;
		nNum = 1000000000;
		while (true) {
			System.out.println("digite um numero inteiro");
			inte = sc.nextInt();
			times++;
			numTotal += inte;
			System.out.println("numero meio atualmente = " + (numTotal / times));
			if (mNum < inte) {
				mNum = inte;
			}

			if (inte == 0) {
				System.out.println("maior numero = " + mNum + "\nmenor numero = " + nNum);
				break;
			}
			if (nNum > inte) {
				nNum = inte;
			}
		}

	}

}
