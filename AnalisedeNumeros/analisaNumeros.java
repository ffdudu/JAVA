import java.io.IOException;
import java.util.Scanner;

public class analisaNumeros {
    public static void main(String[] args) throws IOException 
    {
        try
        {
            
            int contaPares = 0;
            int contaImpares = 0;
            int contaPositivos = 0;
            int contaNegativos = 0;
            Scanner leitor = new Scanner(System.in);
            for (int i = 1 ; i <= 5 ; i++) {
            	System.out.print("Informe o " + i + "º número: ");
                int retornado = leitor.nextInt();
            	if (retornado % 2 == 0)
                    contaPares++;
                else
                    contaImpares++;

                if (retornado > 0)
                    contaPositivos++;
                else
                {
                    if(retornado < 0)
                        contaNegativos++;
                }
            }

            System.out.println( contaPares + " valor(es) par(es)");
            System.out.println( contaImpares + " valor(es) impar(es)");
            System.out.println( contaPositivos + " valor(es) positivo(s)");
            System.out.println( contaNegativos + " valor(es) negativo(s)");

        }
        finally
        {
            return;
        }
    }
}