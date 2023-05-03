import java.util.Scanner;

public class ParouImparMetodo {
    static void ParouImpar(int v) {
        if (v % 2 == 0) {
            System.out.println("O número " + v + " é PAR ");
        } else {
            System.out.println("O número " + v + " é IMPAR ");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Digite um número: ");
        n = input.nextInt();
        ParouImpar(n);

    }

}
