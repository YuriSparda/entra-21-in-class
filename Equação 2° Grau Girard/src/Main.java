import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1a, x1b, x2a, x2b, a, b, c, s, p;
		System.out.println("valor de A");
		a = sc.nextInt();
		System.out.println("valor de B");
		b = sc.nextInt();
		System.out.println("valor de C");
		c = sc.nextInt();
		s = -b / a;
		p = c / a;
		x1a = 0;
		x2a = 0;
		x1b = 0;
		x2b = 0;
		int opções = 0;
		System.out.printf("  %d\nS=------ = %d \n  %d \n", b, s, a);
		System.out.printf("  %d\nP=------ = %d \n  %d \n", c, p, a);
		for (int iA = -10; iA < 11; iA++) {
			for (int jA = -10; jA < 11; jA++) {
				int verif = jA + iA;
				if (verif == s) {
					for (int iB = -10; iB < 11; iB++) {
						for (int jB = -10; jB < 11; jB++) {
							int verifB = jB * iB;
							if (verifB == p && verif == s && iA == iB && jA == jB) {
								System.out
										.println("some igual a X'=" + iA + " + X''=" + jA + " resultado " + (iA + jA));
								x1a = iA;
								x2a = jA;
								System.out.println(
										"produto igual a X'=" + iB + " . X''=" + jB + " resultado " + (iB * jB));
								x1b = iB;
								x2b = jB;
								System.out.println("_______________________________");
								opções++;
							}
						}
					}
				}
			}
		}
		System.out.println("possuem " + opções + " opções possiveis");
		System.out.printf("Solução={%d,%d}", x1a, x2a);

	}

}
