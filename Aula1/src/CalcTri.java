import java.util.Locale;
import java.util.Scanner;

public class CalcTri {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double area, l, a, parametro;
        System.out.println("digite o valor da altura");
        a = sc.nextDouble();
        System.out.println("digite o valor de largura");
        l = sc.nextDouble();
        System.out.println("resultado da area");
        area = a * l;
        System.out.printf("area = %.4f %n ", area);
        System.out.println("valor do parametro");
        parametro = (a * 2) + (l * 2);
        System.out.printf("parametro = %.2f %n", parametro);
        sc.close();
    }
}
