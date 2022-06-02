import java.util.Scanner;

public class teste4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        Var c = Carlos;
        System.out.println("digite sua idade");
        nome = sc.toString();
        if (nome == c) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
