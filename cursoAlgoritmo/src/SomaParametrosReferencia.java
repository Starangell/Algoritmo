public class SomaParametrosReferencia {

    static void soma(int a, int b) {

        a = a + 1;
        b = b + 2;
        System.out.println("Valor de A = " + a);
        System.out.println("Valor de B = " + b);
        System.out.println("Soma A+B = " + (a + b));
    }

    public static void main(String[] args) {

        int x = 4;
        int y = 8;
        soma(x, y);
        System.out.println("Valor de X = " + x);
        System.out.println("Valor de Y = " + y);

    }

}

//pelo que pesquisei não tem como passar valores por referencia

//lembrete: não fiz toda aula porque envolvia refazer o exercicio de fibonnaci(porem ainda nao fiz esse codigo));
//nao assisti do minuto 27 ao 33;

//aula 12 terminada 17h51 04/05/2023