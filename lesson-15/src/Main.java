import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Informe o dia da semana (1-7): ");

        Scanner scan = new Scanner(System.in);
        int weekDay = scan.nextInt();

        switch (weekDay){
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;

            case 4:
                System.out.println("Quarta");
                break;

            case 5:
                System.out.println("Quinta");
                break;

            case 6:
                System.out.println("Sexta");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Não é um dia da semana válido!");
        }
    }
}