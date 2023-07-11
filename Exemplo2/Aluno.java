public class Aluno extends Pessoa {
	private int ra;
	private String turma;
	
	public void setRa(int ra){
		this.ra = ra;
	}
	
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public int getRa(){
		return ra;
	}
	
	public String getTurma(){
		return turma;
	}
}