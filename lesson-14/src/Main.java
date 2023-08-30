import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* IF ELSE */

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");

        double price = scan.nextDouble();

        if (price <= 10) {
            System.out.println("Pode comprar, está barato!");
        } else if (price > 10 && price < 15){
            System.out.println("Pode pedir um desconto.");
        } else if (price >= 15 && price < 17) {
            System.out.println("Melhor pesquisar mais.");
        } else {
            System.out.println("O preço está caro!");
        }
    }
}