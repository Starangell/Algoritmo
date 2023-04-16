import java.util.Scanner;

public class Aproveitamento {
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
        if (media >= 9 && media <= 10) {
            System.out.println("aproveitamento = A");
        } else if (media >= 8 && media < 9) {
            System.out.println("aproveitamento = B");
        } else if (media >= 7 && media < 8) {
            System.out.println("aproveitamento = C");
        } else if (media >= 5 && media < 7) {
            System.out.println("aproveitamento = D");
        } else if (media >= 3 && media < 5) {
            System.out.println("aproveitamento = E");
        } else {
            System.out.println("aproveitamento = F");
        }
        System.out.println("--------------------------- ");
    }
}
// Aproveitamento de um aluno