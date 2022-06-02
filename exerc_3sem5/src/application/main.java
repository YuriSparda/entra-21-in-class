package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		about product1 = new about();
		about product2 = new about();
		about product3 = new about();
		System.out.println("digite o nome do produto 1");
		product1.name = sc.next();
		System.out.println("digite descrição do produto 1");
		product1.discription = sc.next();
		System.out.println("digite valor do produto 1");
		product1.price = sc.nextDouble();
		System.out.println("digite desconto em % do produto 1");
		product1.off = sc.nextDouble();
		System.out.println("digite o nome do produto 2");
		product2.name = sc.next();
		System.out.println("digite descrição do produto 2");
		product2.discription = sc.next();
		System.out.println("digite valor do produto 2");
		product2.price = sc.nextDouble();
		System.out.println("digite desconto em % do produto 2");
		product2.off = sc.nextDouble();
		System.out.println("digite o nome do produto 3");
		product3.name = sc.next();
		System.out.println("digite descrição do produto 3");
		product3.discription = sc.next();
		System.out.println("digite valor do produto 3");
		product3.price = sc.nextDouble();
		System.out.println("digite desconto em % do produto 3");
		product3.off = sc.nextDouble();
		System.out.printf(
				"descrição do Produto1\nNome:%s \n descrição:%s\nValor:%.2f/nDesconto:%.2f\nValor a pagar:%.2f",
				product1.name, product1.discription, product1.price, product1.off, product1.Promo());
		System.out.printf(
				"descrição do Produto2\nNome:%s \n descrição:%s\nValor:%.2f/nDesconto:%.2f\nValor a pagar:%.2f",
				product2.name, product2.discription, product2.price, product2.off, product2.Promo());
		System.out.printf(
				"descrição do Produto3\nNome:%s \n descrição:%s\nValor:%.2f/nDesconto:%.2f\nValor a pagar:%.2f",
				product3.name, product3.discription, product3.price, product3.off, product3.Promo());
	}

}
