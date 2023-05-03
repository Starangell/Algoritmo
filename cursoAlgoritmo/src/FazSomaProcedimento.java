public class FazSomaProcedimento {
    static void soma(int a, int b){
        System.out.println("Recebi o valor " +a);
        System.out.println("Recebi o valor " +b);
        System.out.println("A soma entre os dois é " + (a+b) );

    }
    public static void main(String[] args) {
        
        int x, y;

        x = 5;
        y = 3;

        soma(x, y);

    }
    
}
