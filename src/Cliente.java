import java.util.Date;

public class Cliente {

	private String Cpf;
	private String Nome;
	private Date   createdAt;
	
	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		if(cliente.getNome().equals(Nome) && cliente.getCpf().equals(Cpf))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Nome: " + Nome + " | CPF: " + Cpf; 
	}
}
