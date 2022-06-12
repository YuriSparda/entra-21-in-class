import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite oque vai ser codificado");
		String cifra = sc.nextLine();
		char coded[] = new char[cifra.length()];
		coded = cifra.toCharArray();
		for (int i = 0; i < cifra.length(); i++) {
			if (coded[i] == 32) {
				continue;
			}
			coded[i]++;
			if (coded[i] >= 122 && coded[i] <= 123 && coded[i] >= 91 && coded[i] <= 92) {
				coded[i] -= 25;
			}
			coded[i]++;
			if (coded[i] >= 122 && coded[i] <= 124 && coded[i] >= 91 && coded[i] <= 93) {
				coded[i] -= 25;
			}
			coded[i]++;
			if (coded[i] >= 122 && coded[i] <= 125 && coded[i] >= 91 && coded[i] <= 94) {
				coded[i] -= 25;
			}
		}
		System.out.print(coded);
		System.out.println("\ndecoder");
		for (int i = 0; i < cifra.length(); i++) {
			if (coded[i] == 32) {
				continue;
			}
			coded[i]--;
			if (coded[i] <= 96 && coded[i] >= 99 && coded[i] <= 64 && coded[i] >= 67) {
				coded[i] += 26;
			}
			coded[i]--;
			if (coded[i] <= 96 && coded[i] >= 99 && coded[i] <= 64 && coded[i] >= 67) {
				coded[i] += 26;
			}
			coded[i]--;
			if (coded[i] <= 96 && coded[i] >= 99 && coded[i] <= 64 && coded[i] >= 67) {
				coded[i] += 26;
			}
		}
		System.out.print(coded);
		sc.close();
	}

}
