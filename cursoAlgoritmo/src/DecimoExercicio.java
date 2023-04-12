import java.util.Scanner;

public class DecimoExercicio {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int d;
        int valor = 0;

        System.out.println("----------------- ");
        System.out.println("CRIANÇA ESPERANÇA ");
        System.out.println("-----------------");
        System.out.println(" Muito obrigado por ajudar ");
        System.out.println("[1] para doar R$10 ");
        System.out.println("[2] para doar R$25 ");
        System.out.println("[3] para doar R$50 ");
        System.out.println("[4] para doar outros valores ");
        System.out.println("[5] para cancelar ");
        d = input.nextInt();

        switch (d) {
            case 1:
                valor = 10;
                break;

            case 2:
                valor = 25;
                break;
            case 3:
                valor = 50;
                break;
            case 4:
                System.out.println("Qual o valor da doação? R$ ");
                valor = input.nextInt();
                break;
            case 5:
                valor = 0;
                break;
            
                
        }
        System.out.println("---------------------------");
        System.out.println(" SUA DOAÇÃO FOI DE R$" + valor);
        System.out.println(" MUITO OBRIGADO!");
        System.out.println("---------------------------");

    }
}
