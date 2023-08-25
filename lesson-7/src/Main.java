public class Main {
    public static void main(String[] args) {
        /* understanding error */

        /*===== SYNTAX ERROR =====*/
        System.out.println("Olá mundo"); // se faltar algum ; ou "", irá apresentar um erro de sintaxe


        /*===== SEMANTIC ERROR =====*/
        int cont; // me retorna um erro informando que não inicializei a variável

        cont = 2; // agora inicializando a variável, não retorma mais o erro

        System.out.println("Você digitou: " + cont);


        /*===== EXECUTION TIME ERROR =====*/
        System.out.println("Você digitou: " + 1/0); // irá retornar um erro em tempo de execução, pois nada é divisivel por 0

    }
}