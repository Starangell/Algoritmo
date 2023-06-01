import java.util.Scanner;

public class dissecandoMatrizes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        int l = 0;
        int s = 0;
        int c = 0;
        int t = 0;
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.print("Digite o valor para a posição " + "[" + (l + 1) + "," + (c + 1) + "]");
               // matriz[l][c] = input.nextInt();
            }
        }
        do {
            System.out.println("MENU DE OPÇÕES ");
            System.out.println("================");
            System.out.println("[1] Mostrar a Matriz ");
            System.out.println("[2] Diagonal Principal ");
            System.out.println("[3] Triangulo Superior ");
            System.out.println("[4] Triangulo Inferior ");
            System.out.println("[5] Sair ");
            System.out.println("OPÇÃO: ");
            s = input.nextInt();

            switch (s) {
                case 1:

                    for (l = 0; l < 4; l++) {
                        for (c = 0; c < 4; c++) {
                            System.out.print(matriz[l][c] + "  ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (l = 0; l < 4; l++) {
                        System.out.println(matriz[l][l] + "  ");
                        for (t = 0; t < 0; t++) {
                            System.out.println();
                        }
                    }
                    //peguei essa resposta no git do curso em video

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("SAINDO... ");
                    break;

            }
        } while (s <= 4);

    }

}
// codigo incompleto