import java.util.Scanner;

public class SoComCVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        String Soc[] = new String[10];
        int c;
        int tot = 0;

        for (c = 1; c <= 10; c++) {
            System.out.println("Digite seu nome: ");
            nome = input.next();

            if (nome.charAt(0) == 'C') {
                tot++;
                Soc[tot] = nome;
            }

        }
        System.out.println("-----------------");
        System.out.println("LISTAGEM FINAL");
        System.out.println("-----------------");
        for (c = 1; c <= tot; c++) {
            System.out.println(Soc[c]);

        }

    }

}
//Aula 14 (Pratica 3)
