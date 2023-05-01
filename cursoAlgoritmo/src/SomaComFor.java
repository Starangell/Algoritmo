import java.util.Scanner;

public class SomaComFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int c;
        int n;
        int s = 0;
       for(c=1;c <=5;c++){
        System.out.println("Digite um valor: ");
        n = input.nextInt();

        s= s+n;

        
        


       }
       System.out.println("Soma dos valores : " + s);
    }

}
