import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont = 0;
        int n;
        int maior = 0;
        int menor = 0;
        int s = 0;

        while (cont <= 5) {

            System.out.println("Digite o o.valor ");
            n = input.nextInt();

            if (n > maior) {

                maior = n;
            }
            s = (s + n);
        }

        System.out.println("A soma de todos os valores foi " + s);
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);

    }
}


//em fase de construção;