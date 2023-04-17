import java.util.Scanner;

public class SuperContador {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int digite;
        
        

        do {
            System.out.println("----------------");
            System.out.println("|==============|");
            System.out.println("|     MENU     |");
            System.out.println("|==============|");
            System.out.println("|[1] De 1 a 10 |");
            System.out.println("|[2] 10 1 a 1  |");
            System.out.println("|[3]    Sair   |");
            System.out.println("|==============|");
            System.out.println("----------------");
            digite = input.nextInt();

            

                switch (digite) {

                    case 1:
                        System.out.println("1.. 2.. 3.. 4.. 5.. 6.. 7.. 8.. 9.. 10. ");

                        break;

                    case 2:
                        System.out.println("10.. 9.. 8.. 7.. 6.. 5.. 4.. 3.. 2.. 1. ");

                        break;
                    default:
                    System.out.println("SAINDO... ");
                        break;
                }
            }while (digite <= 2); 

        
    }
}
// super contador
