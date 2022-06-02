import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        System.out.println("type your name");
        userName = sc.nextLine();
        System.out.println("my name is " + userName);
        sc.close();
    }

}
