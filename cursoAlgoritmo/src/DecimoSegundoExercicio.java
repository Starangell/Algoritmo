import java.util.Scanner;

public class DecimoSegundoExercicio {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        float nota1;
        float nota2;
        float media;
        String aproveita = "";

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
        if (media >= 9) {
            System.out.println("APROVEITAMENTO: A");

        } else if (media >= 8 && media >= 7) {
            System.out.println("APROVEITAMENTO: B");

        } else if (media >= 6 && media >= 5) {
            System.out.println("APROVEITAMENTO: C");

        } else if (media >= 4 && media >= 3) {
            System.out.println("APROVEITAMENTO: D");

        } else if (media >= 2 && media >= 1) {
            System.out.println("APROVEITAMENTO: E");

        } else {
            System.out.println("APROVEITAMENTO: F");

        }
        System.out.println("--------------------------- ");
    }
}
// Aproveitamento de um aluno