import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis
        int option;
        int n;
        int ooption;
        long start;
        // Objetos
        FibonacciIterativo Fbi = new FibonacciIterativo();
        FibonacciRecursivo Fbr = new FibonacciRecursivo();
        Scanner in = new Scanner(System.in);
        //
        do {
            System.out.println("MENU-PRINCIPAL");
            System.out.println("");
            System.out.println("Escolha uma das opções a baixo");
            System.out.println("1) Comparar Velocidade");
            System.out.println("2) Executar apenas um dos algoritmos");
            System.out.println("9) Sair");
            option = in.nextInt();

            switch (option) {
                case 1:
                    // Print out iteration method
                    System.out.print("Insira o Ultimo Elemento da Sequencia de Fibonacci: ");
                    n = in.nextInt();

                    System.out.println("Fibonacci Iterativo:");
                    start = System.currentTimeMillis();
                    System.out.printf("Sequencia de Fibonacci(Elemento no index: %d) = %d \n", n, Fbi.fibonacciiT(n));
                    System.out.printf("Tempo: %d ms\n", System.currentTimeMillis() - start);

                    // Print out recursive method
                    System.out.println("Fibonacci Recursivo:");
                    start = System.currentTimeMillis();
                    System.out.printf("Sequencia de Fibonacci(Elemento no index: %d) = %d \n", n, Fbr.fibonacciR(n));
                    System.out.printf("Tempo: %d ms\n", System.currentTimeMillis() - start);
                    break;

                case 2:
                    System.out.println("Gostaria de executar o algoritmo Iterativo ou Recursivo ?");
                    System.out.println("1) Iterativo");
                    System.out.println("2) Iterativo");
                    ooption = in.nextInt();
                    if (ooption == 1) {
                        System.out.print("Insira o Ultimo Elemento da Sequencia de Fibonacci: ");
                        n = in.nextInt();
                        System.out.println("Fibonacci Iterativo:");
                        start = System.currentTimeMillis();
                        System.out.printf("Sequencia de Fibonacci(Elemento no index: %d) = %d \n", n,Fbi.fibonacciiT(n));
                        System.out.printf("Tempo: %d ms\n", System.currentTimeMillis() - start);
                    } else {
                        if (ooption == 2) {
                            System.out.print("Insira o Ultimo Elemento da Sequencia de Fibonacci: ");
                            n = in.nextInt();
                            System.out.println("Fibonacci Recursivo:");
                            start = System.currentTimeMillis();
                            System.out.printf("Sequencia de Fibonacci(Elemento no index: %d) = %d \n", n,Fbr.fibonacciR(n));
                            System.out.printf("Tempo: %d ms\n", System.currentTimeMillis() - start);
                        } else {

                        }
                    }
                    break;

                default:
                    System.out.println("Programa Finalizado, Tenha um ótimo dia ^^");
                    break;
            }

        } while (option != 9);
    }
}