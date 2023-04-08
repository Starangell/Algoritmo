import java.util.Scanner;
            public class quintoExercicio {
                public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);

                    float valor;
                    float porcentagem;
                    float valorfinal;
                    int parcelas;
                    float resultado;
                    String pergunta;
                    String sim;
                    
                    


                    System.out.print("Qual valor do emprestimo? ");   
                        valor = input.nextFloat();

                        porcentagem = (valor * 20) /100;
                        valorfinal = porcentagem + valor;
                    
                        if(pergunta.toUpperCase().equals("SIM") {
                            System.out.print("Você deseja parcelar?  ");
                            pergunta = input.next();
    
                                System.out.println("Quantas parcelas? ");
                                    parcelas = input.nextInt();
    
                                    resultado = valorfinal /parcelas;
    
                                    System.out.print("Valor total do seu emprestimo parcelado:  " +resultado);
                        } else{
                            System.out.println( "Valor do emprestimo: " +valorfinal);
                        }
                }
            }

//projeto incompleto falta colocar os if e else