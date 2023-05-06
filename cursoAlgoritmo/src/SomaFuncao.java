import java.util.Scanner;

public class SomaFuncao {

    static int soma(int x, int y) {

        return x + y;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int v1, v2, s;

        System.out.print("Digite o primeiro valor ");
        v1 = input.nextInt();

        System.out.print("Digite o segundo valor ");
        v2 = input.nextInt();

        s = soma(v1, v2);
        System.out.println("A soma entre " + v1 + " e " + v2 + " é igual a " + s);

    }
}

//aula 13: pratica 1