import java.util.Scanner;

public class ContagemInteligente {
    public static void main(String[] args) {

        int ini;
        int fim;
        int cont;

        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("   CONTAGEM INTELIGENTE   ");
        System.out.println("--------------------------");

        System.out.print("Inicio: ");
        ini = input.nextInt();

        System.out.print("Fim: ");
        fim = input.nextInt();

        System.out.println("--------------------------");
        System.out.println("          CONTANDO        ");
        System.out.println("--------------------------");

        if (ini <= fim) {
            for (cont = ini; cont <= fim; cont++) {
                System.out.print(cont + "..");
            }
        } else {
            for (cont = ini; cont >= fim; cont--) {
                System.out.print(cont + "..");
            }
        }

    }
}
