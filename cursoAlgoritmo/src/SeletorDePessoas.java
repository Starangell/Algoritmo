import java.util.Scanner;

public class SeletorDePessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pergunta;
        int p;
        String idade;
        String cabelo;

        do {

            System.out.println("|==================| ");
            System.out.println("|SELETOR DE PESSOAS| ");
            System.out.println("|==================| ");

            System.out.print("Qual o Sexo? [M/F] ");
            pergunta = input.next();

            System.out.print("Qual a idade? ");
            pergunta = input.next();

            do {
                System.out.println("Qual a cor do Cabelo? ");
                System.out.println("------------------------");
                System.out.println("[1] Preto       ");
                System.out.println("[2] Castanho    ");
                System.out.println("[3] Loiro       ");
                System.out.println("[4] Ruivo       ");
                p = input.nextInt();

                if (p > 0 && p < 5) {
                    System.out.print("Quer continuar? [S/N] ");
                    pergunta = input.next();
                } else {
                    System.out.println("Respota Invalida! Por Favor digite uma das opções acima! ");
                }
            } while (p > 4 );

            if (pergunta.equalsIgnoreCase("18 ")) {
                
                
            }else if (pergunta.equalsIgnoreCase("Castanho ")) {
                
            }

        } while (pergunta.equalsIgnoreCase("S"));

    }

}
// incompleto
// falta saber quantos homem de 18 e cabelos castanhos foram escolhidos
//e quantas mulher entre 25 e 30 cabelos loiros foram escolhidas