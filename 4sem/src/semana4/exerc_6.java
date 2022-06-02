package semana4;

public class exerc_6 {

	public static void main(String[] args) {
		int matriz[][] = new int[4][2];
		matriz[0][0] = 4;
		matriz[0][1] = 2;
		for (int i = 1; i < 4; i++) {
			matriz[i][0] = (matriz[0][0] + 4);
			matriz[i][1] = (matriz[0][1] - 2);

		}
		for (int i = 0; i < 4; i++) {
			System.out.println("x " + i + " e y 0 =" + matriz[i][0]);
			System.out.println("x " + i + " e y 1 =" + matriz[i][1]);
		}

	}

}
