import java.util.Scanner;

public class AptoADiriigir {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int anoAtual;
        int anoDeNascimento;
        int resultado;

        System.out.println("-------------------------");
        System.out.println("DEPARTAMENTO DE TRANSITO");
        System.out.println("-------------------------");

        System.out.print("Ano Atual (yyyy) ");
        anoAtual = input.nextInt();

        System.out.print("Ano de Nascimento (yyyy) ");
        anoDeNascimento = input.nextInt();

        resultado = (anoAtual - anoDeNascimento);

        System.out.println("---------------");
        System.out.println("     STATUS    ");
        System.out.println("---------------");
        System.out.println("Idade: " + resultado + " ANOS ");
        if (resultado >= 18) {
            System.out.println("APTO A TIRAR CARTEIRA ");
        } else {
            System.out.println("INAPTO A TIRAR A CARTEIRA ");
        }

    }
}

// Saber se já está apto a dirigir considerando a idade de 18 anos