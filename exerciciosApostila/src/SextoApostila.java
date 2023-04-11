import java.util.Scanner;

public class SextoApostila {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1;

        System.out.print("Digite um número: ");
        n1 = input.nextInt();

        System.out.println("O Antecessor de: " + n1 + " é " + (n1 - 1));

        System.out.println("O Sucessor de: " + n1 + " é " + (n1 + 1));

    }

}


/*Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10 
*/