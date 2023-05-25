import java.util.Scanner;

public class quartoExercicio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float preco;
        float imposto;

        System.out.print("Qual o valor do produto? ");
        preco = input.nextFloat();

        imposto = (preco * 60) / 100;

        System.out.println("O imposto será de: $" + imposto);

    }

}

// Objetivo desse Exercício: saber qual valor do imposto sobre o valor do
// produto;