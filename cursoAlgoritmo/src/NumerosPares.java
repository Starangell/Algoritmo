import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont;
        int v;

        System.out.print("Digite um valor: ");
        v = input.nextInt();

        if (v%2==1) {
            v--;
        }
        for(cont = v;cont > 0;cont-=2){
            System.out.println(cont);
        }
         





    }
    
}
//nesse codigo ele ta de tras para frente