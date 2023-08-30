import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe o dia da semana (1-7): ");

        Scanner scan = new Scanner(System.in);
        int weekDay = scan.nextInt();

        switch (weekDay) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Não é um dia da semana válido!");
        }
    }
}