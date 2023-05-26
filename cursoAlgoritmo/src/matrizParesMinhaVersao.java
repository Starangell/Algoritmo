import java.util.Scanner;

public class matrizParesMinhaVersao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrizz = new int[3][3];

       
        int par = 0;

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("Digite os " + (l + 1) + "valores: ");
                matrizz[l][c] = input.nextInt();
                if (matrizz[l][c] % 2 == 0) {
                    par++;

                }

            }

        }
        System.out.println("os pares sao " + par);

    }

}
//pratica 2 (aula 15: ler uma matriz 3x3 e mostrar os pares)
//minha versão