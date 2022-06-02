package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero principal");
		int num = sc.nextInt();
		System.out.println("digite 2 numeros separadamente para testar aproximação");
		int X = sc.nextInt();
		int Y = sc.nextInt();
		if (Y < X && X < num || num < X && X < Y) {
			xMaior(X,Y,num);
		} else if (X < Y && Y < num || num < Y && Y < X) {
			yMaior(X,Y,num);
		}

	}

	public static void yMaior(int X, int Y, int num) {
		System.out.printf("%d é o valor mais proximo a %d \ne o valor %d esta mais distante", X, num, Y);

	}

	public static void xMaior(int X, int Y, int num) {
		System.out.printf("%d é o valor mais proximo a %d \ne o valor %d esta mais distante", X, num, Y);

	}
}
