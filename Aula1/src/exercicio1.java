import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner Imput = new Scanner(System.in);
		Scanner PermJ = new Scanner(System.in);
		int Age ; 
		String agree;
		System.out.println("digite sua idade");
		Age = Imput.nextInt();
		System.out.println("possui permiss�o judicial ?");
		agree=PermJ.nextLine();
		
		if(Age>17) {System.out.println("tem permiss�o para tirar a CNH");}
		else if( agree == "sim") {System.out.println("possui permisss�o judicial \nAprovado para CNH");}
		else if( agree == "n�o") {System.out.println("CNH negada!!!!");}
		
		
		
		
		
		

	}

}
