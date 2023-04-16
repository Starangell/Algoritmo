import java.util.Scanner;

public class ValorEmprestimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float valor;
        float porcentagem;
        float valorfinal;
        int parcelas;
        float resultado;
        String pergunta;

        System.out.print("Qual valor do emprestimo? ");

        valor = input.nextFloat();

        porcentagem = (valor * 20) / 100;

        valorfinal = porcentagem + valor;

        System.out.print("Você deseja parcelar?  ");
        pergunta = input.next();

        if (pergunta.equalsIgnoreCase("SIM")) {
            System.out.println("Quantas parcelas? ");
             parcelas = input.nextInt();
            resultado = valorfinal / parcelas;
            System.out.print("Valor total do seu emprestimo parcelado:  " + resultado);

        } else {
            System.out.println("Valor do emprestimo: " + valorfinal);
        }

    }
}

// tive ajuda de cleverson

// saber quanto vai dar um valor de um emprestimo a 20%
