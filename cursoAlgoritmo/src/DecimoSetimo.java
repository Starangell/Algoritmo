import java.util.Scanner;

public class DecimoSetimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s = 0;
        String resp;
        int n;

        do {

            System.out.println("Digite o valor: ");
            n = input.nextInt();
            s = s + n;
            System.out.println("Você quer continuar? [s/n]");
            resp = input.next();

        } while (resp.equalsIgnoreCase("s"));
        System.out.println("A soma de todos os valores é: " + s);

    }
}




/*
 * while:
 * 
 * import java.util.Scanner;
 * 
 * public class DecimoSetimo {
 * public static void main(String[] args) {
 * Scanner input = new Scanner(System.in);
 * 
 * int s = 0;
 * String resp = "s";
 * int n;
 * 
 * 
 * 
 * while (resp.equalsIgnoreCase("s")) {
 * 
 * System.out.println("Digite o valor: ");
 * n = input.nextInt();
 * s = s + n;
 * System.out.println("Você quer continuar? [s/n]");
 * resp = input.next();
 * 
 * }
 * System.out.println("A soma de todos os valores é: " + s);
 * 
 * 
 * //diferença que esse ele verifica o s logo no começo e esse "do" no final;
 * }
 * }
 */