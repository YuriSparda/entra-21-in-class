package whil;

import java.util.Scanner;

public class strgVar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n, h, j;
		String g;
		int age, i;
		i = 0;
		while (true) {
			System.out.println("adicionar aluno ? (y/n)");
			g = sc.next();
			if (g=="y") {
				System.out.println("numero de alunos na turma=" + i);
			}else if (g=="n") {
				
			}
		}
		/*
		 * String n; int i ,x ,a ,o; System.out.println("digite o numero de alunos");
		 * i=sc.nextInt(); x=0; o=0; while (x<i) {x++;
		 * System.out.println("digite a idade do aluno "+x); a=sc.nextInt();
		 * System.out.println("aluno "+x+" tem "+a+" anos"); if (a>20)
		 * {System.out.println("aluno maior de 20 anos identificado"); o=+1; }else if
		 * (a>17&&a<21) {System.out.println("digite o nome do aluno "+x); n =sc.next();
		 * System.out.println("aluno "+x+" nome "+n+" "+a+" anos de idade"); } }
		 */

	}

}