package exep2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o primeiro numero da opera��o");
		int num1=sc.nextInt();
System.out.println("digite o segundo numero da opera��o");
		int num2=sc.nextInt();
		System.out.println("escolha o tipo de opera��o\n1 para somar\n2 para subitrair\n3 para multiplicar\n4 para dividir");
		int esc=sc.nextInt();
		if (esc==1) {System.out.println("Resultado � "+(num1+num2));
			
		}else if (esc==2) {
			System.out.println("Resultado � "+(num1-num2));
			
		}else if (esc==3) {
			System.out.println("Resultado � "+(num1*num2));
			
		}else if (esc==4) {
			System.out.println("Resultado � "+(num1/num2));
			
		}else {
			throw new IllegalArgumentException("opera��o invalida !!!!");
		}
	}

}
