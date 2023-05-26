import java.util.Scanner;

public class lerMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] mat = new int[3][2];

        int l;
        int c;

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 2; c++) {
                System.out.print("Digite o valor da posição " + " [ " + (l+1)+ " , " + (c+1) + " ] ");
                mat[l][c] = input.nextInt();

            }
        }

        for(l = 0; l < 3; l++){
            for(c = 0;c < 2; c++){
                System.out.printf(mat[l][c]+"     ");
            }
            System.out.println();
        }

    }

}
// Pratica 1: (aula 15 matriz)
//to meio desligado e tive ajuda do chatgpt para corrigir umas coisas
//codigo feito no linux
