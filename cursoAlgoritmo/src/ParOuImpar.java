import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {

        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = input.nextInt();

        if ((n % 2) == 0) {
            System.out.println("O número " + n + " é par ");
        } else {
            System.out.println("o número " + n + " é impar ");
        }

    }

}

// par ou impar