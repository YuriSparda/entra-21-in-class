package whil;

import java.util.Scanner;

public class vet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int num[]= new int[5];
			num[0]=1234;
			num[1]=3124;
			num[2]=3214;
			num[3]=2134;
			num[4]=4123;
			while (true) {
				System.out.println("digite um numero (ate 4 com 4 digitos)");
				int numC = sc.nextInt();
			if (numC==num[0]) {System.out.println("correto a primeira numero");
				break;
			}else if (numC==num[1]) {System.out.println("correto ao segundo numero");
				break;
			}else if (numC==num[2]) {System.out.println("correto ao terceiro numero");
				break;
			}else if (numC==num[3]) {System.out.println("correto ao quarto numero");
				break;
			}else if (numC==num[4]) {System.out.println("correto ao quinto numero");
				break;
			}System.out.println("incorreto tente novamente");
			}
	}

}
