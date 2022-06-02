package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Comp  comp = new Comp();
		System.out.println("digite um numero");
		comp.num=sc.nextInt();
		System.out.println(comp);
	}

}
