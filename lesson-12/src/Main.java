import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // chamando a função de scanner(capturar dados de entrada via terminal)
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome completo");

        // atribuíndo os dados coletados à variável name
        String fullName = scan.nextLine();

        System.out.println("Prazer, " + fullName + " e seja bem-vindo.");
    }
}