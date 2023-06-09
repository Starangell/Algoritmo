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

            System.out.println(NomeTime[1] + "  [ ] x [ ]  " + NomeTime[2]);
            System.out.println(NomeTime[2] + "  [ ] x [ ]  " + NomeTime[3]);
            System.out.println(NomeTime[3] + "  [ ] x [ ]  " + NomeTime[1]);

        }
    }
}

// Exercicio aula 14:(Torneio de Futbol)
//terminado dia: 12/05/2023 ás 15h20



/*Versão do Guanabara:
 * algoritmo "TorneioFutebol"
// =============================================================
// Algoritmo para verificar o resultado de uma partida de futebol
//
// AUTOR: Gustavo Guanabara
// Curso COMPLETO disponivel GRATIS no site www.cursoemvideo.com
// =============================================================
var
  time: vetor[1..3] de Caractere
  l, c: Inteiro
inicio
   EscrevaL("------------------")
   EscrevaL("CAMPEONATO FUTEBOL")
   EscrevaL("------------------")
   Para c <- 1 ate 3 faca
      Escreva ("Nome do ", c, "o. time: ")
      Leia(time[c])
   FimPara
   
   LimpaTela
   EscrevaL("-------------------")
   EscrevaL(" TABELA DE PARTIDAS")
   EscrevaL("-------------------")
   Para l <- 1 ate 3 faca
      Para c <- 1 ate 3 faca
         Se (l <> c) entao
            EscrevaL(time[l]:12, " [ ] x [ ] ", time[c]:12)
         FimSe
      FimPara
   FimPara
fimalgoritmo
 */



 
 /*import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time = new String[3];

        System.out.println("------------------");
        System.out.println("CAMPEONATO FUTEBOL");
        System.out.println("------------------");

        for (int c = 0; c < 3; c++) {
            System.out.print("Nome do " + (c + 1) + "o. time: ");
            time[c] = scanner.nextLine();
        }

        clearScreen();
        System.out.println("-------------------");
        System.out.println(" TABELA DE PARTIDAS");
        System.out.println("-------------------");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                if (l != c) {
                    System.out.printf("%-12s [ ] x [ ] %-12s\n", time[l], time[c]);
                }
            }
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
(versão chatgpt)
 */