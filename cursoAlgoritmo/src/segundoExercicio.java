    import java.util.Scanner;

    public class segundoExercicio {
        public static void main(String[] args) {

            float reais;
            // float dolares = 5.06f;
            float resultado;

            Scanner input = new Scanner(System.in);

            System.out.print("Quantos Reais eu tenho? ");
             reais = input.nextFloat();

            resultado = reais / 5.06f;

            System.out.println("Posso ter: " + resultado + "$");

            if (resultado>=10000) {
                System.out.println("Partiu Disney ");
            }else{
                System.out.println("#chateado");
            }

        }
    }



//Objetivo desse Exercício: Saber quanto vou ter convertendo reais em dolar.
//Se quiser pode colocar para dizer uma frase acima de um certo valor ou dizer outra frase abaixo de um certo valor
