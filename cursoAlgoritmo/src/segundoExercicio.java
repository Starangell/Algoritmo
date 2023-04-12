import java.text.DecimalFormat;
import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {

        float reais;
        int c;
        // float dolares = 5.06f;
        float resultado;
        int q;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Quantas vezes você deseja fazer a conversão? ");
        q = input.nextInt();

        for (c = 1; c <= q; c++) {

            System.out.print("Qual valor em R$ ");
            reais = input.nextFloat();

            resultado = reais / 4.95f;

            System.out.println("O valor convertido é " + df.format(resultado) + "$");
        }

    }
}

/*
 * if (resultado >= 1.000) {
 * System.out.println("Partiu Disney ");
 * } else {
 * System.out.println("#chateado");
 * }
 */

/*
 * Objetivo desse Exercício: Saber quanto vou ter convertendo reais em dolar.
 * // Se quiser pode colocar para dizer uma frase acima de um certo valor ou
 * dizer
 * outra frase abaixo de um certo valor
 */
