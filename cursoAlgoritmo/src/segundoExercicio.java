import java.util.Scanner;

public class segundoExercicio {
    public static void main(String[] args) {

        float reais;
        // float dolares = 5.06f;
        float resultado;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos Reais eu tenho? ");
        reais = input.nextFloat();

        resultado = reais / 5.06f;

        System.out.print("Posso ter: " + resultado + "$");

    }
}



//Objetivo desse Exercício: Saber quanto vou ter convertendo reais em dolar.
