public class MyExcecao extends Exception{
	MyExcecao(int numero){ //Constutor sobrecarregado
		System.out.println("\nClasse MyExcecao - Lancou valor negativo");
	}
	
	public String getMsg(){
		return "Utilizou o metodo getMsg() da MyExcecao";
	}
}