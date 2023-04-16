import java.util.Scanner;

public class ResultadoJogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gols1;
        int gols2;
        int diferença;

        System.out.println("-----------------------------");
        System.out.println("      BANGU X MADUREIRA      ");
        System.out.println("-----------------------------");
        System.out.println("Quantos gols do BANGU?       ");
        gols1 = input.nextInt();
        System.out.println("Quantos gols do MADUREIRA?   ");
        gols2 = input.nextInt();
        System.out.println("-----------------------------");
        diferença = (gols1 - gols2);
        System.out.println("DIFERENÇA: " + Math.abs(diferença));

        switch (diferença) {
            case 0:
                System.out.println("STATUS: EMPATE");
                break;
            case 1, 2, 3:
                System.out.println("STATUS: PARTIDA NORMAL");
                break;
            default:
                System.out.println("STATUS: GOLEADA");
                break;
        }
        System.out.println("-----------------------------");

    }

}
