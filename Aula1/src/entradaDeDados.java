import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String lastName , name;
		name = sc.nextLine();
		System.out.println("Digite seu sobrenome");
		lastName=sc.nextLine();
		System.out.println("bem vindo" + name + " " + lastName);

	}

}
