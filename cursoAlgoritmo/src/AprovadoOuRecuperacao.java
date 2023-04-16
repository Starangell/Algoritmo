import java.util.Scanner;

public class AprovadoOuRecuperacao {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        float nota1;
        float nota2;
        float media;

        System.out.println("--------------------------- ");
        System.out.println("ESCOLA DOMINGOS ALBUQUERQUE ");
        System.out.println("--------------------------- ");

        System.out.print("Primeira Nota: ");
        nota1 = input.nextFloat();

        System.out.print("Segunda Nota: ");
        nota2 = input.nextFloat();
        System.out.println("--------------------------- ");

        media = (nota1 + nota2) / 2;
        System.out.println("MEDIA: " + media);
        if (media >= 6) {
            System.out.println("ALUNO APROVADO ");
        } else if (media >= 5 && media < 7) {
            System.out.println("ALUNO EM RECUPERAÇÃO ");
        } else {
            System.out.println("ALUNO REPROVADO ");
        }
        System.out.println("--------------------------- ");

    }
}

// Aluno aprovado ou reprovado ou em recuperação