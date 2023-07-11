public class TestaDiv {
	public static void main(String args[]){
		Leitura l = new Leitura();
		boolean novoCalculo = true;
		boolean testeDiv = true;
		String resp = "S";
		int calculon = 1;
		
		while(novoCalculo){
			testeDiv = true;
			System.out.println("\nCalculo " + calculon++);
			while(testeDiv){
				try{
					int numero = Integer.parseInt(l.inData("\nEntre com um numero: "));
					int divisor = Integer.parseInt(l.inData("\nEntre com o divisor: "));
					System.out.println("\nO resultado da divisao eh: " + numero/divisor);
					testeDiv = false;
				}catch(ArithmeticException er_Div){
					System.err.println("\nNao existe divisao por zero. Erro: " + er_Div);
				}catch(NumberFormatException nfe){
					System.out.println("\nO numero e/ou divisor deve ser numeros! Erro: " + nfe);
				}
			}
			resp = l.inData("\nDeseja realizar outro calculo? S ou N ");
			if (resp.equalsIgnoreCase("N")){
				novoCalculo = false;
			}
			
		}
	}
}