import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// criando variavel global
class global {
    static String Cadastro[] = new String[5];
    static String Alunos[] = new String[3];
    static String respostas[][] = new String[3][];
}

public class gabarito {

    public static void main(String[] args) {

        System.out.println("PASO 1 - Cadastro de Gabarito ");
        System.out.println("------------------------------");

        global.Cadastro = cadastrogabarito(global.Cadastro);

        cadastroalunos();

    }

    public static void clearTerminal() { // função para limpar terminal
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static String input(String text) { // função para pegar o input do usuario
        Scanner input = new Scanner(System.in);
        System.out.print(text);
        return input.next().toUpperCase();
    }

    public static String[] cadastrogabarito(String[] gabarito) {
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = input("Questão " + (i + 1) + ": ");
        }
        return gabarito;
    }

    public static void respostasDoAluno(int index) {
        String respostasDoAluno[] = new String[5];
        for (int i = 0; i < respostasDoAluno.length; i++) {
            respostasDoAluno[i] = input("Questão " + (i + 1) + ": ");
        }
        global.respostas[index] = respostasDoAluno;
    }

    public static void cadastroalunos() {
        clearTerminal(); // limpar o terminal

        for (int i = 0; i < global.Alunos.length; i++) {
            System.out.println("-------------");
            System.out.println("   ALUNO " + (i + 1));
            System.out.println("-------------");

            global.Alunos[i] = input("Nome: ");

            respostasDoAluno(i);
            clearTerminal();
        }

        
    }

}
