package semana4;

public class exerc_7 {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		matriz[0][0] = 4;
		matriz[0][1] = 2;
		matriz[0][2] = 12;
		matriz[0][3] = -3;
		matriz[1][0] = 2;
		matriz[1][1] = 12;
		matriz[1][2] = -3;
		matriz[1][3] = 4;
		matriz[2][0] = 12;
		matriz[2][1] = -3;
		matriz[2][2] = 4;
		matriz[2][3] = 2;
		matriz[3][0] = 12;
		matriz[3][1] = -3;
		matriz[3][2] = 12;
		matriz[3][3] = -3;
		int matriz1[][] = new int[4][4];
		matriz1[0][0] = 4;
		matriz1[0][1] = 2;
		matriz1[0][2] = 12;
		matriz1[0][3] = -3;
		matriz1[1][0] = 2;
		matriz1[1][1] = 12;
		matriz1[1][2] = -3;
		matriz1[1][3] = 4;
		matriz1[2][0] = 12;
		matriz1[2][1] = -3;
		matriz1[2][2] = 4;
		matriz1[2][3] = 2;
		matriz1[3][0] = 12;
		matriz1[3][1] = -3;
		matriz1[3][2] = 12;
		matriz1[3][3] = -3;
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {
				System.out.println("matiz[" + (i + 1) + "][" + (j + 1) + "] = " + (matriz[i][j] + matriz1[i][j]));
			}
		}
	}
}
