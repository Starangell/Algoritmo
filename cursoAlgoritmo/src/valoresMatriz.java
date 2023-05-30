import java.util.Scanner;

public class valoresMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[4][4];
        int l, c, sDP = 0, p2L = 1, mai3C = 0;

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.print("Digite o valor da Posição " + "[" + (l + 1) + "," + (c + 1) + "]");
                m[l][c] = input.nextInt();
                if (l == c) {
                    sDP = sDP + m[l][c];
                }
            }
        }

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.print(m[l][c] + "    ");
            }
            System.out.println();
        }
        for (c = 0; c < 4; c++) {
            p2L = (p2L * m[1][c]);
        }
        for (l = 0; l < 4; l++) {
            if (m[l][2] > mai3C) {
                mai3C = m[l][2];

            }

        }

        System.out.println("A soma dos valores da Diagonal Principal é " + sDP);
        System.out.println("O produto dos valores da Segunda Linha é " + p2L);
        System.out.println("O maior valor da Terceira Coluna é " + mai3C);

    }

}
// pratica 4 (aula 15: Preencher uma matriz de 4 ordem)
// Adicional: A soma dos valores da diagonal principal
// O Produto entre os valores da Segunda Linha
// O Maior valor da terceira coluna
//..