import java.util.Scanner;

public class ValoresParesFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cont;
        int valor;
        System.out.print("Digite um valor: ");
        valor = input.nextInt();

        if (valor % 2 == 1) {
            valor--;

        }
        for (cont = valor; cont >= 0; cont -= 2) {
            System.out.println(cont);

        }

    }

}
