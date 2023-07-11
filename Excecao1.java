import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excecao1 {

	public static void main(String args[]){
		BufferedReader memoria = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Entrada de dados");
		String s = "";
		
		boolean continua = true;
			while(continua){
			System.out.println("\nEntre com um valor: ");
			try{
				s = memoria.readLine();
				int numero = Integer.parseInt(s);
				System.out.println("\n O quadradp do valor de Entrada eh: " + numero * numero);
				continua = false; //condição deparada de laço caso não ocorra exceção
			}
			catch(IOException erro1){
				//System.out.println("\nErro na entrada de dados: " + erro1);
				erro1.printStackTrace();
			}
			catch(NumberFormatException erro2){
				System.out.println("\n Deve entrar com um numero: " + erro2);
				erro2.printStackTrace();
			}
			finally{
				System.out.println("\n Entrou no Finally");
			}
		}
		System.out.println("\n O valor de entrada foi: " + s);
	}
}