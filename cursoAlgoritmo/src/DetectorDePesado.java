import java.util.Scanner;

public class DetectorDePesado {
    static void topo() {
        System.out.println("DETECTOR  DE  PESADO ");
        
        //nao consegui fazer que nem no video porcausa da variavel dps tento concertar
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        String pesado = "";
        float peso;
        float maior_peso = 0;

        System.out.println("-----------------------------");
        topo();
        System.out.println("Maior Peso até agora: " + maior_peso + "Kg");
        System.out.println("-----------------------------");

        for (int i = 1; i <= 5; i++) {
            String nome = "";
            System.out.print("Digite o nome: " + nome);
            nome = input.next();
            System.out.print("Digite o peso de " + nome + ": ");
            peso = input.nextFloat();

            if (peso > maior_peso) {
                maior_peso = peso;
                pesado = nome;

            }
            System.out.println("-----------------------------");
            topo();
            System.out.println("Maior Peso até agora: " + maior_peso + "Kg");
            System.out.println("-----------------------------");

        }
        System.out.println("-----------------------------");
        topo();
        System.out.println("Maior Peso até agora: " + maior_peso + "Kg");
        System.out.println("-----------------------------");
        System.out.println("A pessoa mais pesada foi " + pesado + " com " + maior_peso + " quilos ");

    }
}
