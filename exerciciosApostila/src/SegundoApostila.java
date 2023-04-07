import java.util.Scanner;

public class SegundoApostila {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String name;

        System.out.println("Qual Seu Nome? ");
        name = input.next();

        System.out.println("Olá " +name + ", é um prazer te conhecer. ");

    }
}

/* 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
    *   Ex:
    *  Qual é o seu nome? João da Silva
    *    Olá João da Silva, é um prazer te conhecer!
    *
 */