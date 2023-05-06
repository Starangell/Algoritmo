public class Fibonnaci {
    public static void main(String[] args) {

        int r = 1;
        int f = 0;

        for (int c = 1; c <= 7; c++) {

            r = r + f;
            f = f + r;

            System.out.println(r + " " + f);

        }

    }

}







/*
 * Exercício da aula 11: terminado +/- as 15h10 no dia 06/05/2023
 * Como consegui fazer: Estava na aula 13 fazendo uma prática sobre fatorial e
 * quando eu estava
 * debugando para entender o código do fatorial
 *  percebi na estrutura *for* uma coisa que poderia me ajudar a fazer o exercício
 * de fibonaccique eu tanto sofri/sofria para tentar fazer
 * mesmo Cleverson me mandando uma lógica para eu tentar fazer eu não estava
 * conseguindo
 * só consegui agora
 * (um pouco na doida, porém consegui) (;
 */