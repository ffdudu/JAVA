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
			
			System.out.print ("Informe o 1º valor da operação: ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());

			System.out.print ("Informe o 2º valor da operação: ");
			st = new StringTokenizer(br.readLine());
			int b = Integer.parseInt(st.nextToken());
			
			int total = a * b;
			System.out.println("PROD = " + total);
		}
		finally
		{
			return;
		}
	}
}