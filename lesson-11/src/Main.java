public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /** Tipos Primitivos **/

        /* Números inteiros */

        // Byte = (-128 até 127)                    | byte age = 20;
        // Short = (-32.768 até 32.767)             | short age = 20;
        //* Int = (Números inteiros)                | int age = 20;
        //* Long = (Números inteiros longos)        | long age = 20;

        byte ageByte = 21;
        short ageShort = 22;
        int ageInt = 23;
        long ageLong = 24;

        System.out.println("idade da variável ageByte: " + ageByte);
        System.out.println("idade da variável ageShort: " + ageShort);
        System.out.println("* idade da variável ageInt: " + ageInt);
        System.out.println("* idade da variável ageLong: " + ageLong);

        /* Números fracionados */

        // Float = (números fracioandos)            | float balance = 100.04f;
        //* Double = (números fracionados longos)   | double balance = 100.04;

        float balanceFloat = 2.90f;
        double balanceDouble = 3.90;

        System.out.println("valor da variável balanceFloat: " + balanceFloat);
        System.out.println("* valor da variável balanceDouble: " + balanceDouble);

        /* Caracter */

        // Char = (letra)                           | char letter = 'a';

        char letter = 'a';

        System.out.println("valor da variável letter: " + letter);

        /* Verdadeiro ou Falso */

        // Boolean = (True/False)                   | boolean true = true;

        boolean valTrue = true;

        System.out.println("valor da variável valTrue: " +  valTrue);

    }
}