import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* IF ELSE */

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade: ");

        int age = scan.nextInt();

        if (age >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade.");
        }
    }
}