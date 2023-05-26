import java.util.Scanner;

public class matrizPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] valores = new int[3][3];
        int l;
        int c;
        int totPar = 0;

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                System.out.print("Digite o valor da posição " + "[" + (l + 1) + "," + (c + 1) + "]");
                valores[l][c] = input.nextInt();
            }

        }
        System.out.println();
        System.out.println("MATRIZ: ");
        System.out.println("-----------");

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                if (valores[l][c] % 2 == 0) {
                    System.out.print("{" + "  " + valores[l][c] + "  " + "}");
                    totPar++;
                } else
                    System.out.print(valores[l][c] + "    ");
            }
            System.out.println();
        }
        System.out.println("Ao todo foram digitados " + totPar + " valores pares ");
    }

}
//pratica 2 (aula 15: ler uma matriz 3x3 e mostrar os pares)
