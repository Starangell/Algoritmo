import java.util.Scanner;

public class TerceiroApostila {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name; //nome usuario
        String end;  // final do texto
        Float  wage; //salario


        System.out.print("Nome do Funcionário: ");
        name = input.next();
        
        System.out.print("Salário: ");
        wage = input.nextFloat();

        System.out.print("O Funcionário " +name + " teve um salário de  " +wage + " em junho.");
       
         
    }
}

//erros a resolver: quando do espaco da erro no codigo