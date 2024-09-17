import java.util.Scanner;

public class FibonacciChecker {

    public static boolean isFibonacci(int number) {
        int a = 0;
        int b = 1;
        int next = a + b;

        if (number == 0 || number == 1) {
            return true;
        }

        while (next <= number) {
            if (next == number) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para verificar se pertence à sequência de Fibonacci:");
        int number = scanner.nextInt();
        scanner.close();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}

