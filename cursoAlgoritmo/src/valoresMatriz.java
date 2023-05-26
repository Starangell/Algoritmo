import java.util.Scanner;

public class valoresMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m = new int[4][4];
        int l, c;

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.print("Digite o valor da Posição " + "[" + (l+1) + "," + (c+1) + "]");
                m[l][c] = input.nextInt();

            }

        }

    }

}
//pratica 4 (aula 15: Preencher uma matriz de 4 ordem)
//codigo incompleto
//codigo incompleto