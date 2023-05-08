import java.util.Scanner;

public class TesteVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v[] = new int[11];
        int c;

        for (c = 1; c <= 10; c++) {
            System.out.println("Digite o " + c + "o. valor: ");
            v[c] = input.nextInt();
        }

        for (c = 1; c <= 10; c++) {
            System.out.print(" { " + v[c] + " } ");
        }

    }

}
