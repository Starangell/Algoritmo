import java.util.Scanner;

public class QuartoApostila2 {
    public static void main(String[] args) throws Exception {

        

        Float n1;
        Float n2;
        Float sun;

        n1 = Input("Digite o primeiro número: ");
        n2 = Input("Digite o segundo número: ");
        sun = (n1 + n2);
        System.out.println("Seu Resultado é: " +sun);
    }

    static float Input(String text){
        Scanner input = new Scanner(System.in);
        System.out.print(text);              
        float values = input.nextFloat();
        return values;
    }
}


    /* 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
    *entre eles.
    *Ex:
    *Digite um valor: 8
    *Digite outro valor: 5
    *A soma entre 8 e 5 é igual a 13.
    *
    */
