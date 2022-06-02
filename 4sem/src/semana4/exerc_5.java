package semana4;

public class exerc_5 {

	public static void main(String[] args) {
		int matriz[][] = new int[12][2];
		for (int i = 0; i < 12; i++) {
			matriz[i][0] = matriz[i][0] + 5;
			matriz[i][1] = matriz[i][1] + 1;

		}
		for (int i = 0; i < 12; i++) {
			System.out.println("x " + i + " e y 0 =" + matriz[i][0]);
			System.out.println("x " + i + " e y 1 =" + matriz[i][1]);
		} /*
			 * }for (int i = 0; i < 12; i++) { System.out.println("matriz["+i+"][1]=;");
			 * System.out.println("matriz["+i+"][0]="+(i+1)+";"); }
			 */

	}

}
