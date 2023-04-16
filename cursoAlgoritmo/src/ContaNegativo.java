import java.util.Scanner;

public class ContaNegativo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int c = 1;
        int totn = 0;

        do {
            System.out.println("Digite um número: ");
            n = input.nextInt();
            c++;

            if (n < 0) {
                totn++;
            }

        } while (c <= 5);
        System.out.println("Foram digitados: " + totn + " valores negativos. ");

    }
}

// aula 10: pratica 2 ;