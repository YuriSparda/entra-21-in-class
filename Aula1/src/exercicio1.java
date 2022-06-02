import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner Imput = new Scanner(System.in);
		Scanner PermJ = new Scanner(System.in);
		int Age ; 
		String agree;
		System.out.println("digite sua idade");
		Age = Imput.nextInt();
		System.out.println("possui permissão judicial ?");
		agree=PermJ.nextLine();
		
		if(Age>17) {System.out.println("tem permissão para tirar a CNH");}
		else if( agree == "sim") {System.out.println("possui permisssão judicial \nAprovado para CNH");}
		else if( agree == "não") {System.out.println("CNH negada!!!!");}
		
		
		
		
		
		

	}

}
