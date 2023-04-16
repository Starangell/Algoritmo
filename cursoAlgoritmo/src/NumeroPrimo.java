import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contador = 1;
        int numero;
        int contdiv = 0;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        do {

            if (numero % contador == 0) {

                contdiv++;

            }
            contador++;

        } while (contador <= numero);
        if (contdiv > 2) {
            System.out.println("O valor " + numero + " não é primo ");
        } else {
            System.out.println("O valor " + numero + " é primo");
        }

    }

}
