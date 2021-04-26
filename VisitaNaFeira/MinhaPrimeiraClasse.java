import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse 
{
    public static void main(String[] args) throws IOException 
    {
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print ("Informe o número de pimentões amarelos: ");
			StringTokenizer st = new StringTokenizer(br.readLine());
            int amarelos = Integer.parseInt(st.nextToken());
			System.out.print ("Informe o número de pimentões vermelhos: ");
			st = new StringTokenizer(br.readLine());
            int vermelhos = Integer.parseInt(st.nextToken());
            int total = amarelos + vermelhos;
            System.out.println("Total = " + total);
        }
        finally
        {
            return;
        }
    }   
}