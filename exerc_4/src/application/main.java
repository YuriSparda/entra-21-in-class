package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um numero");
		int num=sc.nextInt();
		Comp  comp = new Comp();
		
		comp.check(num);
	}

}
