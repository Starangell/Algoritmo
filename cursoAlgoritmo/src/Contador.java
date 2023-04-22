import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cont;
        int n;
        int maior = 0;
        int menor = 100000000;
        int s = 0;
        

        for (cont = 1; cont <= 5; cont++) {

            System.out.println("Digite o " + cont + "o.valor");
            n = input.nextInt();

            if (n > maior) {

                maior = n;
            }else if(n<menor){
                menor = n;
            }
            s = (s + n);
        }
        System.out.println("A soma de todos os valores foi " + s);
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);

    }

}


/*
 * //em fase de aprendizagem sobre for
 * O "for" é uma estrutura de controle em Java que permite executar um bloco de
 * código repetidamente com base em um contador. Ele tem a seguinte sintaxe
 * geral:
 * 
 * for (inicialização; condição; atualização) {
 * // bloco de código a ser executado
 * }
 * 
 * "inicialização" é a expressão é a expressão que define o valor inicial do
 * contador. (que define o número inicial do contador.)
 * 
 * "condição" é a expressão que verifica se o loop deve continuar executando ou
 * não. Enquanto essa condição for verdadeira, o loop continuará a ser
 * executado. Se for falsa, o loop será encerrado. (até que número deve ir)
 * 
 * "atualização" é a expressão que atualiza o valor do contador em cada iteração
 * do loop. (se é pra somar ou diminuir)
 * 
 * Aqui está um exemplo simples de um loop "for" que imprime números de 1 a 5:
 * 
 * 
 * for (int i = 1; i <= 5; i++) {
 * System.out.println(i);
 * }
 */
