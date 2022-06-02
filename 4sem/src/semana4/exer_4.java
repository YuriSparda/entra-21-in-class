package semana4;

import java.util.Scanner;

public class exer_4 {

	public static void main(String[] args) {
		int num[]=new int[4];
		int vet[]=new int[4];
		int res[]=new int[4];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < res.length; i++) {
			System.out.println("digite o valor do primeiro vetor "+i+" tipo "+1);
			num[i]=sc.nextInt();
		}for (int i = 0; i < res.length; i++) {
			System.out.println("digite o valor do primeiro vetor "+i+" tipo "+2);
			vet[i]=sc.nextInt();
		}for (int i = 0; i < res.length; i++) {res[i]=num[i]+vet[i];
			System.out.println("tipo 3 vet"+i+" \n"+num[i]+"+"+vet[i]+"="+res[i]);
		}
		
		
		
 }
}
