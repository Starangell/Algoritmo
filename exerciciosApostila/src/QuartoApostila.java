import java.util.Scanner;

public class QuartoApostila {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Float n1;
        Float n2;
        Float sun;

        System.out.println("Digite o Primeiro número: ");              
        n1 = input.nextFloat();

        System.out.println("Digite o Segundo número: ");
        n2 = input.nextFloat();

        sun = (n1 + n2);

        System.out.println("Seu Resultado é: " +sun);
    }
}
