import java.util.Scanner;

public class ValoresParesVetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, totpar = 0;
        int val[] = new int[8];

        for (i = 1; i <= 7; i++) {
            System.out.println("Digite " + i + "o.valor: ");
            val[i] = input.nextInt();
           
        }
      
        
        for(i = 1;i<=7;i++){
            if (val[i] % 2 == 0) {
                totpar++;
                System.out.println("Valor Par na Posição " +i);
            }
        }
        System.out.println("O total de pares foi " + totpar);
    }

}
//aula 14:(pratica 1);