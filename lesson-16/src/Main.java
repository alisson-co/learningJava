public class Main {
    public static void main(String[] args) {
        /* while | do while */

        int i = 1;
        int max = 10;

        System.out.println("Contando de " + i + " até " + max);
        while (i <= max){
            System.out.println("Valor do i: " + i);
            i++;
        }

        System.out.println("Valor de i: " + i + " após sair da estrutura: while.");

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println("Valor de i: " + i + " após sair da estrutura: do while.");

    }
}