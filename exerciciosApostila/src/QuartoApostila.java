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

/* 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
    *entre eles.
    *Ex:
    *Digite um valor: 8
    *Digite outro valor: 5
    *A soma entre 8 e 5 é igual a 13.
    *
    */
