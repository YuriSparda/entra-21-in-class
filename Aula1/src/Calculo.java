import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , resultado;
        System.out.println("digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        num2 = sc.nextInt();
        resultado=num1+num2;
        System.out.println("Resltado de " + num1 + " + " + num2 + " é " + resultado);
        sc.close();
    }

}
