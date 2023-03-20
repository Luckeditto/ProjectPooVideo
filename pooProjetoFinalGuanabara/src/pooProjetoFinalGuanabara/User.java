package pooProjetoFinalGuanabara;

public class User extends Pessoa {
	private String login;
	private int totAssistido;
	

	public User(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido=0;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getTotAssistido() {
		return totAssistido;
	}



	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}


	public void viuMaisUm() {
		this.setTotAssistido(getTotAssistido()+1);
	}

	@Override
	protected void ganharExp() {
		
		
	}


	@Override
	public String toString() {
		return "User [" + super.toString()+ "\nlogin "+ login + ", totAssistido=" + totAssistido + "]";
	}
	
	
	

}
