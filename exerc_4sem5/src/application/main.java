package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calc circulo1 = new calc();
		calc circulo2 = new calc();
		calc circulo3 = new calc();
		calc circulo4 = new calc();
		calc circulo5 = new calc();
		System.out.println("digite o raio do circulo 1");
		circulo1.Raio = sc.nextDouble();
		System.out.printf("resultado = %.2f \n", circulo1.area());
		System.out.println("digite o raio do circulo 2");
		circulo2.Raio = sc.nextDouble();
		System.out.printf("resultado = %.2f \n", circulo2.area());
		System.out.println("digite o raio do circulo 3");
		circulo3.Raio = sc.nextDouble();
		System.out.printf("resultado = %.2f \n", circulo3.area());
		System.out.println("digite o raio do circulo 4");
		circulo4.Raio = sc.nextDouble();
		System.out.printf("resultado = %.2f \n", circulo4.area());
		System.out.println("digite o raio do circulo 5");
		circulo5.Raio = sc.nextDouble();
		System.out.printf("resultado = %.2f \n", circulo5.area());

	}

}
