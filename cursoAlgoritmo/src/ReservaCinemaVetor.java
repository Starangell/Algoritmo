import java.util.Scanner;

public class ReservaCinemaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reserva[] = {" [ B1 ][ B2 ][ B3 ][ B4 ][ B5 ][ B6 ][ B7 ][ B8 ][ B9 ][ B10 ] "};
        String sn = "";
       

        
        do {
            System.out.println("[ B1 ][ B2 ][ B3 ][ B4 ][ B5 ][ B6 ][ B7 ][ B8 ][ B9 ][ B10 ]");
            System.out.println("-------------------------------------------------------------");
            System.out.print("Reservar a Cadeira: " + "B");
                reserva = input.next();
    
                
    
                System.out.println("Deseja Continuar? [S/N] ");
                sn = input.next();
            
         } while (sn.equalsIgnoreCase("S"));
            
      
    }

}
// exercicio aula 14 (Reseva cadeira cinema)
// Em fase de construção
//lembrete: testar codigo
//commit diario 2
//cleverson ta me dando uma pequena ajuda para fazer os exercicios dessa aula(opinando dando ideais e etc);