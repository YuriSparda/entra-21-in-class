package heran�a1;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String especie = "Canina";
		boolean homePet = true;
		Double peso = 10.5;
		String ra�a = "Vira lata";
		cachorro dog = new cachorro(especie, homePet, peso, ra�a);
System.out.println(dog.Dog());
System.out.println(dog.petSond());
	}

}
