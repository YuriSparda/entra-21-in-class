package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calc uniDeBlu = new calc();
		calc uniDeJoin = new calc();
		calc uniDeFloripa = new calc();
		System.out.println("Unidade blumenau\nDigite o numero de maças vendidas");
		uniDeBlu.apple = sc.nextInt();
		System.out.println("valor de unidade de cada maça vendida");
		uniDeBlu.applePrice = sc.nextDouble();
		System.out.println("numero de laranjas vendidas");
		uniDeBlu.orange = sc.nextInt();
		System.out.println("valor da unidade de cada laranja;");
		uniDeBlu.orangePrice = sc.nextDouble();
		System.out.println("Unidade blumenau\nDigite o numero de maças vendidas");
		uniDeJoin.apple = sc.nextInt();
		System.out.println("valor de unidade de cada maça vendida");
		uniDeJoin.applePrice = sc.nextDouble();
		System.out.println("numero de laranjas vendidas");
		uniDeJoin.orange = sc.nextInt();
		System.out.println("valor da unidade de cada laranja;");
		uniDeJoin.orangePrice = sc.nextDouble();
		System.out.println("Unidade blumenau\nDigite o numero de maças vendidas");
		uniDeFloripa.apple = sc.nextInt();
		System.out.println("valor de unidade de cada maça vendida");
		uniDeFloripa.applePrice = sc.nextDouble();
		System.out.println("numero de laranjas vendidas");
		uniDeFloripa.orange = sc.nextInt();
		System.out.println("valor da unidade de cada laranja;");
		uniDeFloripa.orangePrice = sc.nextDouble();
		System.out.printf(
				"unidade blumenau \nvalor total de vendas de maça = %.2f$ \nvalor total venda de laranjas %.2f$ \nValor final de lucro %.2f$",
				uniDeBlu.valorMaça(), uniDeBlu.valorlaranja(), (uniDeBlu.valorlaranja() + uniDeBlu.valorMaça()));
		System.out.printf(
				"unidade joinville \nvalor total de vendas de maça = %.2f$ \nvalor total venda de laranjas %.2f$ \nValor final de lucro %.2f$",
				uniDeJoin.valorMaça(), uniDeJoin.valorlaranja(), (uniDeJoin.valorlaranja() + uniDeJoin.valorMaça()));
		System.out.printf(
				"unidade florianopolis \nvalor total de vendas de maça = %.2f$ \nvalor total venda de laranjas %.2f$ \nValor final de lucro %.2f$",
				uniDeFloripa.valorMaça(), uniDeFloripa.valorlaranja(),
				(uniDeFloripa.valorlaranja() + uniDeFloripa.valorMaça()));

	}

}
