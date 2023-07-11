public class Inicio {
	public static void main(String args[]){
		Leitura l = new Leitura();
		Pessoa pes = new Pessoa();
		
		boolean testaint = true;
		while (testaint){
			try{
				pes.setRg(Integer.parseInt(l.inData("\nEntre com o ID<deve ser numero>:")));
				testaint = false;
			}catch(NumberFormatException nfe){
				System.out.println("\nO Rg deve ser um numero. ");
			}
		}
		
		pes.setNome(l.inData("\nEntre com o nome: "));
		System.out.println("\n Id...: " + pes.getRg());
		System.out.println("\n Nome...: " + pes.getNome());
	}
}