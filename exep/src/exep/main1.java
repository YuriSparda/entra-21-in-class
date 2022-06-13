package exep;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	int vet[] = new int[5];
		try {
			int num = sc.nextInt();
		} catch (Exception e) {
			throw new IllegalArgumentException("não pode utilizar letras;");
			
		}
		
		
		
		
		
		/*Funcionamento do try
		 * 
		 * try {
			vet[sc.nextInt()] = sc.nextInt();

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Erro");
		} catch (ArithmeticException e) {
			System.err.println("error 2");
		} finally {
			System.err.println("isso é tudo pessoal");
			sc.close();
		}*/

	}

}
