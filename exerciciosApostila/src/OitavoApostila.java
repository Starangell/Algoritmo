import java.util.Scanner;

public class OitavoApostila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cal;
        double metros;
        double km;
        double hm;
        double dam;
        double dm;
        double cm;
        double mm;

        System.out.println("Digite uma distancia em metros: ");
        metros = input.nextDouble();

        System.out.println("A distancia de " + metros + "m" + "corresponde a : ");

        cal = (metros / 1000);
        hm = (metros / 100);
        dam = (metros / 10);
        dm = (metros * 10);
        cm = (metros * 100);
        mm = (metros * 1000);

        System.out.println(cal + "km");
        System.out.println();
        System.out.println(hm + "hm");
        System.out.println();
        System.out.println(dam + "dam");
        System.out.println();
        System.out.println(dm + "dm");
        System.out.println();
        System.out.println(cm + "cm");
        System.out.println();
        System.out.println(mm + "mm");

        /*
         * 8) Desenvolva um programa que leia uma distância em metros e mostre os
         * valores
         * relativos em outras medidas.
         * Ex:
         * Digite uma distância em metros: 185.72
         * A distância de 85.7m corresponde a:
         */

    }

}
