import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        float m;
        float a;
        double imc;

        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println(" Massa (kg ): ");
        m = input.nextFloat();

        System.out.println(" Altura (m): ");
        a = input.nextFloat();

        imc = m / Math.pow(a, 2);

        System.out.println("IMC: " + df.format(imc));
        if (imc < 14) {
            System.out.println("Muito abaixo do Peso. ");
        } else if (imc >= 17 && imc <= 18.5) {
            System.out.println("Abaixo do Peso ");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso ideal. ");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso ");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade ");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Severa ");
        } else {
            System.out.println("Obesidade Morbida ");
        }

    }
}

// Calculadora de IMC