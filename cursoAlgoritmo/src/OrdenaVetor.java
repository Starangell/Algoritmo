import java.util.Scanner;
public class OrdenaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vet[] = new int[11];
        int i, j, aux;

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite um valor: ");
            vet[i] = input.nextInt();
        }

        for (i = 1; i <= 9; i++) {
            for (j = i + 1; j <= 10; j++) {
                if (vet[i] > vet[j]) {

                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;

                }

            }

        }
        for (i = 1; i <= 10; i++) {
            System.out.print(" { " + vet[i] + " } ");

        }

    }

}
//aula 14(Praticva 04)