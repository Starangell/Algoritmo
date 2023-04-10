import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimoPrimeiroExercicio {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        String nome;
        float sal;
        float nsal;
        int dep;

        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("Qual o nome do Funcionario? ");
        nome = input.next();

        System.out.print("Qual o salário do Funcionario? R$");
        sal = input.nextFloat();

        System.out.println("Qual a quantidade de depedentes? ");
        dep = input.nextInt();

        switch (dep) {

            case 0:
                nsal = sal + (sal * 5 / 100);
                break;
            case 1, 2, 3:
                nsal = sal + (sal * 10 / 100);
                break;
            case 4, 5, 6:
                nsal = sal + (sal * 15 / 100);
                break;
            default:
                nsal = sal + (sal * 18 / 100);
                break;
        }
        System.out.println("O novo salário de " + nome + "sera de R$ " + df.format(nsal));

    }
}

// quantidade de depedentes de um funcionario