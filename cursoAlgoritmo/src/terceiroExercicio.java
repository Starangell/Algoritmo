import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float f;
        float c;
        float cal;

        System.out.println("Qual Temperatura Aqui? ");
        f = input.nextFloat();

        cal = (f - 32) / 1.8f;

        System.out.println("No Brasil estaria: " + cal + " ºC");

    }
}

// Alterações para fazer depois: formatar o resultado para ficar ex: 37.8

// Objetivo desse Exercício: Saber qual temperatura daria convertendo
// Farenheitns para Celsius