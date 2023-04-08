import java.util.Scanner;
public class PrimeiroExercicio{

public static void main (String[] args) {

     Scanner input = new Scanner(System.in);

     int ano;
     int anoatual;
     int idade;

     System.out.println("Olá, em que ano nós estamos? ");

     System.out.print("Olá, estamos no ano de: ");
     anoatual = input.nextInt();  

     System.out.println("Em que ano eu nasci? ");

     System.out.print("Você nasceu no  ano de: ");
     ano = input.nextInt();
    
     System.out.println("Quantos anos eu tenho? ");

     idade = (anoatual - ano);
     System.out.print("Você tem: " + idade + " anos e ");

     if (idade >= 21) {
        System.out.println(" você já é maior de idade.  ");
     }else{
        System.out.println(" você ainda é menor de idade. ");
     }











    }   
}
 
//Objetivo desse Exercício: Saber a idade informando o ano de nascimento e o ano atual;
//Se quiser pode informar se já é maior de idade ou se ainda é menor de idade
