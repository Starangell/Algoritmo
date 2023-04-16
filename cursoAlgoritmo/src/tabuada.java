import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        int cont = 1;
        int n;
        int r;

        System.out.println("Quer ver a tabuada de qual número?  ");
        n = input.nextInt();

        do {

            r = n*cont;
            System.out.println(n + " x " + cont + " = " + r);
            cont++;

        } while (cont <= 10);

    }
}

//aula 10: pratica 1 ;