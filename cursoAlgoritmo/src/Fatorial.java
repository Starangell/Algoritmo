import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contador;
        int numero;
        String resposta;

        do {

            System.out.println("Digite um número: ");
            numero = input.nextInt();

            contador = numero;
            int f = 1;

            do {

                f = f * contador;
                contador--;
            } while (contador > 0);
            System.out.println("O valor do fatorial de " + numero + " é igual a " + f);
            System.out.print("Quer continuar? [S/N]");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

    }

}

//aula 10: pratica 3