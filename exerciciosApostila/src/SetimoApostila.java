import java.util.Scanner;

public class SetimoApostila {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float n1;
        float multiplicaçao;
        float divisao;

        System.out.print("Digite um número: ");
        n1 = input.nextFloat();

        multiplicaçao = (n1 * 2);
        divisao = (n1 / 3);

        System.out.println("O Dobro de: " + n1 + " é " + multiplicaçao);

        System.out.println("A terça parte de: " + n1 + " é " + divisao);

    }

}
/*
 * import java.util.Scanner;
 * 
 * public class SetimoApostila {
 * public static void main(String[] args) {
 * 
 * Scanner input = new Scanner(System.in);
 * 
 * float n1;
 * 
 * System.out.print("Digite um número: ");
 * n1 = input.nextFloat();
 * 
 * System.out.println("O Dobro de: " + n1 + " é " + (n1 * 2));
 * 
 * System.out.println("A terça parte de: " + n1 + " é " + (n1 / 3));
 * 
 * }
 * 
 * }
 * 
 * 
 * /*
 * Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
 * sua terça parte.
 * Ex:
 * Digite um número: 3.5
 * O dobro de 3.5 é 7.0
 * A terça parte de 3.5 é 1.16666
 */
