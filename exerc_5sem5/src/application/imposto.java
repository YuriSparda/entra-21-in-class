package application;

import java.util.Iterator;

public class imposto {
	String name[] = new String[5];
	String CPF[] = new String[5];
	String UF[] = new String[5];
	double renda[] = new double[5];

	public String Back() {
		double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;
		double imposto[] = new double[5];
		int person=0;
		int person1=0;
		double total=0;
		for (int i = 0; i < 5; i++) {
			if (renda[i] > max) {
				max = renda[i];
				person=i;
			}
			if (renda[i] < min) {
				min = renda[i];
				person1=i;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (renda[i] > 0 && renda[i] < 4000) {
				imposto[i] = 0;
			} else if (renda[i] > 4001 && renda[i] < 9000) {
				imposto[i] = renda[i] * 0.058;
			} else if (renda[i] > 9001 && renda[i] < 25000) {
				imposto[i] = renda[i] * 0.15;
			} else if (renda[i] > 25001 && renda[i] < 35000) {
				imposto[i] = renda[i] * 0.275;
			} else if (renda[i] > 35000) {
				imposto[i] = renda[i] * 0.30;
			}
		}for (int i = 0; i < imposto.length; i++) {
			total+=imposto[i];
		}

		return "usuario que paga mais imposto = "+name[person]+"\nUsuario que paga o menor imposto = "+name[person1]+"\nTotal de imposto arrecadado = "+total;
	}
}
