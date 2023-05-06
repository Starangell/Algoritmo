import java.util.Scanner;

public class AnalisadorStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n;
        int posicao;
        int codigo;
        int c;

        System.out.print("Digite seu nome: ");
        n = input.next();
        System.out.println("Total de letras do seu nome: " + n.length());
        System.out.println("Seu nome em maiusculas é " + n.toUpperCase());
        System.out.println("Seu nome em maiusculas é " + n.toLowerCase());
        System.out.println("A primeira letra do seu nome é " + n.substring(0, 1));
        System.out.println("A ultima letra do seu nome é " + n.substring(8, 9));
        posicao = n.indexOf('v');
        System.out.println("Seu nome tem a letra V na posição " + posicao);
        codigo = n.charAt((posicao));
        System.out.println("O codigo da letra é " + codigo);
        System.out.println("A letra de codigo 118 é " + Character.toString(118));

    }
}
// obs: depois melhoror o codigo(para fazer umas correções etc);
// obs: terminar de fazer esse codigo