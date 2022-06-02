import java.util.Scanner;

public class teste3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("digite sua idade");
        idade = sc.nextInt();
        if (idade < 18) {
            System.out.println("acesso negado");
            while (idade > 18) {
                System.out.println("acesso permitido");
                break;
            }
            sc.close();
        }

    }
}
