import java.util.Scanner;

public class DecimoQuarto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contador;
        int valor;
        int salto;

        System.out.print("Quer contar até quanto? ");
        valor = input.nextInt();

        System.out.print("Qual valor do salto? ");
        salto = input.nextInt();

        for(contador = 0; contador<= valor; contador += salto) {
            System.out.println(contador);
        }

        
        











//em fase de aprendizagem sobre for







    }

}




/*O "for" é uma estrutura de controle em Java que permite executar um bloco de código repetidamente com base em um contador. Ele tem a seguinte sintaxe geral:

for (inicialização; condição; atualização) {
    // bloco de código a ser executado
}

"inicialização" é a expressão  é a expressão que define o valor inicial do contador. (que define o número inicial do contador.)

"condição" é a expressão que verifica se o loop deve continuar executando ou não. Enquanto essa condição for verdadeira, o loop continuará a ser executado. Se for falsa, o loop será encerrado. (até que número deve ir)

"atualização" é a expressão que atualiza o valor do contador em cada iteração do loop. (se é pra somar ou diminuir)

Aqui está um exemplo simples de um loop "for" que imprime números de 1 a 5:


for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
*/
