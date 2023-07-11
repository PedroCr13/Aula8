public class TesteArray {

	public static void main(String args[]){
		Leitura l = new Leitura();
		boolean testeArr = true;
		try{
			int vetor[] = new int[5];
			int valor = Integer.parseInt(l.inData("\nInforme o valor: "));
			int endereco = Integer.parseInt(l.inData("\nInforme o endereco do vetor: "));
			vetor[endereco] = valor;
			System.out.println("\n Valor " + vetor[endereco] + " no endereco " + endereco);
			testeArr = false;
		}
		catch(ArrayIndexOutOfBoundsException er_Array){
			System.err.println("\nEndereco invalido para o Array! Erro: " + er_Array);
		}
		catch(NumberFormatException er_Num){
			System.out.println("\n O valor informado deve ser o numero inteiro: erro " + er_Num);
		}
	}
}