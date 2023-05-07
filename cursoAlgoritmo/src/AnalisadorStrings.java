import java.util.Scanner;

public class AnalisadorStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n;

        System.out.print("Digite seu nome: ");
        n = input.next();
        System.out.println("Total de letras do seu nome: " + n.length());
        System.out.println("Seu nome em maisculas é " + n.toUpperCase());
        System.out.println("Seu nome em minusculas é " + n.toLowerCase());
        System.out.println("A primeira letra do seu nome é " + n.charAt(0));
        System.out.println("A ultima letra do seu nome é " + n.toUpperCase().charAt(n.length() - 1));
        System.out.println("Seu nome tem a letra A na posição " + n.toUpperCase().indexOf("A"));
        System.out.println("O codigo da letra " + " 'a' " + " é " + Character.codePointAt((n), 4));
        System.out.println("A letra de codigo 97 é: " + Character.toString(97));

        for (int c = n.length() - 1; c >= 0; c--) {
            System.out.print(n.charAt(c));
        }

    }
}