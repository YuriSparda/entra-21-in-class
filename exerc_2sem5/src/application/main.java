package application;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		calc uniDeBlu = new calc();
		calc uniDeJoin = new calc();
		calc uniDeFloripa = new calc();
		System.out.println("Unidade blumenau\nDigite o numero de ma�as vendidas");
		uniDeBlu.apple = sc.nextInt();
		System.out.println("valor de unidade de cada ma�a vendida");
		uniDeBlu.applePrice = sc.nextDouble();
		System.out.println("numero de laranjas vendidas");
		uniDeBlu.orange = sc.nextInt();
		System.out.println("valor da unidade de cada laranja;");
		uniDeBlu.orangePrice = sc.nextDouble();
		System.out.println("Unidade blumenau\nDigite o numero de ma�as vendidas");
		uniDeJoin.apple = sc.nextInt();
		System.out.println("valor de unidade de cada ma�a vendida");
		uniDeJoin.applePrice = sc.nextDouble();
		System.out.println("numero de laranjas vendidas");
		uniDeJoin.orange = sc.nextInt();
		System.out.println("valor da unidade de cada laranja;");
		uniDeJoin.orangePrice = sc.nextDouble();
		System.out.println("Unidade blumenau\nDigite o numero de ma�as vendidas");
		uniDeFloripa.apple = sc.nextInt();
		System.out.println("valor de unidade de cada ma�a vendida");
		uniDeFloripa.applePrice = sc.nextDouble();
		System.out.println("numero de laranjas vendidas");
		uniDeFloripa.orange = sc.nextInt();
		System.out.println("valor da unidade de cada laranja;");
		uniDeFloripa.orangePrice = sc.nextDouble();
		System.out.printf(
				"unidade blumenau \nvalor total de vendas de ma�a = %.2f$ \nvalor total venda de laranjas %.2f$ \nValor final de lucro %.2f$",
				uniDeBlu.valorMa�a(), uniDeBlu.valorlaranja(), (uniDeBlu.valorlaranja() + uniDeBlu.valorMa�a()));
		System.out.printf(
				"unidade joinville \nvalor total de vendas de ma�a = %.2f$ \nvalor total venda de laranjas %.2f$ \nValor final de lucro %.2f$",
				uniDeJoin.valorMa�a(), uniDeJoin.valorlaranja(), (uniDeJoin.valorlaranja() + uniDeJoin.valorMa�a()));
		System.out.printf(
				"unidade florianopolis \nvalor total de vendas de ma�a = %.2f$ \nvalor total venda de laranjas %.2f$ \nValor final de lucro %.2f$",
				uniDeFloripa.valorMa�a(), uniDeFloripa.valorlaranja(),
				(uniDeFloripa.valorlaranja() + uniDeFloripa.valorMa�a()));

	}

}
