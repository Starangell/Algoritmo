import java.util.Scanner;

public class CorrigindoProvasVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Cadastro[] = new String[5];
        String Alunos[] = new String[3];
        String respostas[] = new String[5];

        System.out.println("PASO 1 - Cadastro de Gabarito ");
        System.out.println("------------------------------");
        cadastrogabarito(input, Cadastro);
        cadastroalunos(input, Alunos, respostas);

    }

    public static void cadastrogabarito(Scanner input, String[] gabarito) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Questão " + (i + 1) + ":");
            gabarito[i] = input.next();
        }

    }

    public static void cadastroalunos(Scanner input, String[] alunoss, String[] respostass) {
        int teste;
        for (int o = 0; o < 3; o++) {
            System.out.println("-------------");
            System.out.println("   ALUNO " + (o + 1));
            System.out.println("-------------");
            System.out.print("Nome: ");
            alunoss[o] = input.next();
            System.out.println("RESPOSTAS DADAS ");
            for (int p = 0; p < 5; p++) {
                System.out.print("Questão " + (p + 1) + ":");
                respostass[o] = input.next();

            }

        }

    }

}

// Exercicio aula 14(Corringo Prova)
// eu tive a ideia de criar o metodo porem como tava com duvidas pedi ajudar ao
// chatgpt para criar(só o metodo cadastrogabarito)
// Falta fazer a parte que ele diz a nota e a media da turma
