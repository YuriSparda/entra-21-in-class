package Application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		int age[]= new int[5];
		for (int i = 0; i < name.length; i++) {
			System.out.println("digite o nume do aluno "+(i+1));
			name[i]=sc.next();
			System.out.println("idade do aluno "+(i+1));
			age[i]=sc.nextInt();
		}

	}

}
