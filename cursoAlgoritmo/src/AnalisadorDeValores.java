import java.text.DecimalFormat;
import java.util.Scanner;

public class AnalisadorDeValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        int valor;
        int digite = 0;
        float soma = 0;
        float media = 0;
        int divisi = 0;
        int nulos = 0;
        int pares = 0;

        for (valor = 1; valor <= 5; valor++) {
            System.out.print("Digite o " + valor + "o. Valor: ");
            digite = input.nextInt();

            soma = soma + digite;
            media = soma / 5;

            if (digite == 0) {
                nulos++;
            }
            if (digite % 5 == 0) {
                divisi++;

            }

            if (digite % 2 == 0) {
                pares = pares + digite;
            }

        }

        System.out.println("A soma entre os valores é: " + df.format(soma));
        System.out.println("A média entre os valores é: " + media);
        System.out.println("Valores divisiveis por cinco: " + divisi);
        System.out.println("Valores nulos: " + nulos);
        System.out.println("A soma dos valores pares é: " + pares);

    }
}
/*
 * terminado as 16h15 no dia 06/05/2023
 * terminei no mesmo dia do de fibonnacci
 * (tive uma mini ajuda de cleverson ele so deu uma dica de qual sinal que era)
 * (;
 */