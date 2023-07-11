public class TestaExc{
	
	public static void testaNumero(int numero) throws MyExcecao{
		if (numero > 0){
			System.out.println("\n Numero Positivo: " + numero);
		}
		else {
			throw new MyExcecao(numero); //Dispara a excecao
		}
	}
	
	public static void main(String args[]){
		Leitura l = new Leitura();
		int numero = Integer.parseInt(l.inData("\nEntre com um valor: "));
		try{
			testaNumero(numero);
		}catch(MyExcecao me){
			System.out.println("\n Disparou minha excecao! " + me);
			System.out.println("\n Mensagem do getMsg() " + me.getMsg());
		}
	}
}