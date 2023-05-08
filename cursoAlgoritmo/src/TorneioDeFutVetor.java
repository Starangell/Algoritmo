import java.util.Scanner;

public class TorneioDeFutVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String NomeTime[] = new String[5];
        int i;

        System.out.println("------------------");
        System.out.println("CAMPEONATO FUTEBOL");
        System.out.println("------------------");

        for (i = 1; i <= 3; i++) {

            System.out.print("Nome do " + i + "o. time: ");
            NomeTime[i] = input.next();
        }
        System.out.println("------------------");
        System.out.println("TABELA DE PARTIDAS ");
        System.out.println("------------------");
        for (i = 1; i <= 2; i++) {
            System.out.println(NomeTime[i] + "  [ ] x [ ]  " + NomeTime[i]);
            System.out.println(NomeTime[i] + "  [ ] x [ ]  " + NomeTime[i]);
            System.out.println(NomeTime[i] + "  [ ] x [ ]  " + NomeTime[i]);

        }

    }

}
//Exercicio aula 14:(Torneio de Futbol)
//em fase de construção