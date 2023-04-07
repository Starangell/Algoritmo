import java.util.Scanner;

public class QuintoApostila {
    public static void main(String[] args) throws Exception {

        float u1;
        float u2;
        float u3;
        float media;


         Scanner input = new Scanner(System.in);


         System.out.print("Digite sua nota em Portugês na 1º Unidade : ");
            u1 = input.nextFloat();


         System.out.print("Digite sua nota em Portugês na 2º Unidade: ");
            u2 = input.nextFloat();

            media = (u1+u2) /2;

            System.out.println("A média entre " +u1 + " e " +u2 + " é igual a " +media);


         }
    } 


    /* 5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
     * na tela a sua média na disciplina.
     * Ex:
     * Nota 1: 4.5
     * Nota 2: 8.5
     * A média entre 4.5 e 8.5 é igual a 6.5
     *
     */