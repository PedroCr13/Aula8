public class TestaCalcular {

	public static void main(String args[]){
		
		Leitura l = new Leitura();
		Calcular cal = new Calcular();
		
		int a, b, calculo;
		a = Integer.parseInt(l.inData("\nDigite o numero: "));
		b = Integer.parseInt(l.inData("\nDigite o divisor: "));
		try{
			calculo = cal.dividir(a, b);
		}catch(IOException ioe){
			System.out.println("\nOcorreu um erro: " + ioe);
		}
		System.out.println("\nO resultado eh: " + calculo);
	}
}