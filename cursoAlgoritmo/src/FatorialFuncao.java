import java.util.Scanner;

public class FatorialFuncao {
    static int fatorial(int v) {

        int r = 1;

        for (int c = 1; c <= v; c++) {
            r = r * c;
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, f;

        System.out.print("Digite um número: ");
        n = input.nextInt();
        f = fatorial(n);
        System.out.println("O valor de " + n + "! é igual a " + f);

    }

}
//aula 13: pratica 3
//Não fiz a pratica 4(sobre fibonacci) porque java nao tem passagem por referencia );