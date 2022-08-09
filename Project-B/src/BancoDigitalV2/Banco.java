package BancoDigitalV2;

import java.util.ArrayList;

public class Banco {
	private String nomeBanco;
	private String numBanco;
	private String agencia;
	private ArrayList<Conta> contas;

	public Banco(String nomeBanco, String numBanco, String agencia) {
		this.contas = new ArrayList<Conta>();
		this.agencia = agencia;
		this.numBanco = numBanco;
		this.nomeBanco = nomeBanco;
	}
	
	public String getNumBanco() {
		return numBanco;
	}

	public void setNumBanco(String numBanco) {
		this.numBanco = numBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void exibirContas() {
		System.out.println("- L I S T A   D E   C O N T A S    ");
		System.out.println("-----------------------------------");
		System.out.println("- Banco:   " + this.getNomeBanco());
		System.out.println("- Agencia: " + this.getAgencia());
		System.out.println("- N*Banco: " + this.getNumBanco());
		System.out.println("-----------------------------------");
		for (int i = 0; i < this.contas.size(); i++) {
			System.out.println("- Nome:    "  + contas.get(i).getCliente().getNome());
			System.out.println("- Idade:   "  + contas.get(i).getCliente().getIdade());
			System.out.println("- Email:   "  + contas.get(i).getCliente().getEmail());
			System.out.println("- Celular: "  + contas.get(i).getCliente().getCelular());
			System.out.println("- CPF:     "  + contas.get(i).getCliente().getCpf());
			System.out.println("- N*Conta: "  + contas.get(i).getNumConta());
			System.out.println("- Saldo:   "  + contas.get(i).getSaldo());
			System.out.println("- Limite:  "  + contas.get(i).getLimite());
			System.out.println("- Tipo da Conta: " + contas.get(i).getTipoDeConta());
			System.out.println("-----------------------------------");
		}
	}
}
