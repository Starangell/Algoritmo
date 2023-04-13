import java.util.Scanner;

public class DecimoSexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alunos;
        String nome;
        String alunom = "";
        String alunop = "";
        float nota;
        float maior = 0f;
        float menor = Float.MAX_VALUE;
        int repet;

        System.out.println("-----------------------------------");
        System.out.println("    ESCOLA DOMINGOS ALBUQUERQUE    ");
        System.out.println("-----------------------------------");

        System.out.print("Quantos alunos a turma tem? ");
        alunos = input.nextInt();

        System.out.println("-----------------------------------");

        for (repet = 1; repet <= alunos; repet++) {
            System.out.println("ALUNO " + repet);
            System.out.print("Nome do aluno: ");
            nome = input.next();
            System.out.print("Nota de " + nome + ":");
            nota = input.nextFloat();
            System.out.println("------------------");

            if (nota > maior) {
                maior = nota;
                alunom = nome;
            }
            if (nota < menor) {

                menor = nota;
                alunop = nome;
            }

        }
        System.out.println("O melhor aproveitamento foi de " + alunom + " com a nota " + maior);
        System.out.println("A menor nota foi de " + alunop + " com a nota " + menor);

    }

}

// tive ajuda do chatgpt