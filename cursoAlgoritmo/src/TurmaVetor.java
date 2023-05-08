import java.util.Scanner;

public class TurmaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome[] = new String[5];
        float n1[] = new float[5];
        float n2[] = new float[5];
        float m[] = new float[5];
        float sm = 0, mt = 0; // (SM = Soma da media);(MT=Media da turma);
        int i, tot = 0;

        for (i = 1; i <= 4; i++) {
            System.out.println("Aluno " + i);
            System.out.print("Nome: ");
            nome[i] = input.next();
            System.out.print("Primeira Nota: ");
            n1[i] = input.nextFloat();
            System.out.print("Segunda Nota: ");
            n2[i] = input.nextFloat();
            m[i] = (n1[i] + n2[i]) / 2;
            sm = sm + m[i];
        }
        mt = sm / 4;
        System.out.println("-------------------");
        System.out.println("LISTAGEM DE ALUNOS");
        System.out.println("-------------------");
        for (i = 1; i <= 4; i++) {
            System.out.println(nome[i] + "              " + m[i]);
            if (m[i] > mt) {
                tot++;
            }

        }
        System.out.println("Ao todo temos " + tot + " alunos acima da media da turma que é " + mt);

    }

}
// aula 14(pratica 2);