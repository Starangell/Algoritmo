public class FibonnaciMetodo {
    public static void main(String[] args) {
        int c, t1, t2, t3;

        t1 = 0;
        System.out.print(t1);
        t2 = 1;
        System.out.println(t2);
        for (c = 3; c <= 15; c++) {
            t3 = t1 + t2;
            System.out.println(t3);
            t1 = t2;
            t2 = t3;
        }

    }
}

/*
 * aula 12(fazendo a parte que pulei);
 * obs: tentei fazer porem pelo que sei não tem como passar valores por
 * referencia no java;
 * ent resolvi fazer o modelo de fibonnaci pronto do guanabara;
 */