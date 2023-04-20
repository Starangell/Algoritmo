import java.util.Scanner;

public class SeletorDePessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pergunta = "";
        String sexo;
        int cabelo;
        int idade;
        int contadorm = 0;
        int contadorf = 0;

        do {

            System.out.println("|==================| ");
            System.out.println("|SELETOR DE PESSOAS| ");
            System.out.println("|==================| ");

            System.out.print("Qual o Sexo? [M/F] ");
            sexo = input.next();

            System.out.print("Qual a idade? ");
            idade = input.nextInt();

            do {
                System.out.println("Qual a cor do Cabelo? ");
                System.out.println("------------------------");
                System.out.println("[1] Preto       ");
                System.out.println("[2] Castanho    ");
                System.out.println("[3] Loiro       ");
                System.out.println("[4] Ruivo       ");
                cabelo = input.nextInt();

                if (cabelo > 0 && cabelo < 5) {
                    System.out.print("Quer continuar? [S/N] ");
                    pergunta = input.next();
                } else {
                    System.out.println("Respota Invalida! Por Favor digite uma das opções acima! ");
                }
            } while (cabelo > 4);

            if (sexo.equalsIgnoreCase("m") && idade >= 18 && cabelo == 2) {
                contadorm++;
            } else if (sexo.equalsIgnoreCase("f") && idade >= 25 && idade < 31 && cabelo == 3) {
                contadorf++;
            }

        } while (pergunta.equalsIgnoreCase("S"));
        System.out.println("------------------");
        System.out.println("RESULTADO FINAL ");
        System.out.println("------------------");
        System.out.println("Total de homens com mais de 18 e cabelos castanhos: " + contadorm);
        System.out.println("Total de mulheres entre 25 e 30 e cabelos loiro: " + contadorf);
    }

}

/*
 * projeto concluido +/ as 10h28 20/04/2023
 * estou muito feliz pq foi um projeto relativamnete dificil mas no final
 * consegui fazer sem ajuda de thisiscleverson e sem usar o chatgpt só
 * asssitindo as
 * aulas
 * oq foi mais dificl para mim nesse projeto foi contabilizar o total de homem e
 * mulheres;
 * (e por criatividade minha adicionei uma "função" para caso digitar um número
 * invalido voltar para ele digitar novamente);
 * 
 * 
 */