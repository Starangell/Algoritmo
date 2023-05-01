import java.util.Scanner;

public class QuantosEntreZeroeDez {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c;
        int v;
        int tot010 = 0;
        int simp = 0;
        int simpp = 0;
        for (c = 1; c <= 6; c++) {
            System.out.print("Digite um valor: ");
            v = input.nextInt();

            if (v >= 0 && v <= 10) {
                tot010++;
                if (v % 2 == 1) {
                    simp = simp + v;
                }

            }
            if (v % 2 == 1) {
                simpp = simpp + v;
            }
        }
        System.out.println("Ao todo foram " + tot010 + " valores entre 0 e 10 ");
        System.out.println("Nesse intervalo, a soma de Impares foi " + simp);
        System.out.println("A soma de todos os impares foi " + simpp);

    }

}
