package BancoDigitalV2;

public class Cliente {
	private String nome;
	private String email;
	private String cpf;
	private String celular;
	private int idade;
	
	public Cliente(String nome, String email, String cpf, String celular, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.celular = celular;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void dadosDoCliente() {
		System.out.println("-----------------------------------");
		System.out.println("- D A D O S   D O   C L I E N T E   ");
		System.out.println("-----------------------------------");
		System.out.println("- CPF:     " + this.getCpf());
		System.out.println("- Nome:    " + this.getNome());
		System.out.println("- Email:   " + this.getEmail());
		System.out.println("- Idade:   " + this.getIdade());
		System.out.println("- Celular: " + this.getCelular());
		System.out.println("-----------------------------------");
	}
}
