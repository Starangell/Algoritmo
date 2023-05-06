import java.util.Scanner;

public class ParImparFuncao {

    static String parouimpar(int v) {
        if (v % 2 == 0) {
            return "PAR";
        } else
            return "IMPAR";

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        String r;

        System.out.print("Digite um número: ");
        n = input.nextInt();
        r = parouimpar(n);
        System.out.println("O número " + n + " é um valor " + r);

    }

}
//aula 13: pratica 2;