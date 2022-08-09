package BancoDigitalV2;

import java.util.ArrayList;

public class Conta implements ITransacao {
	private float saldo;
	private float limite;
	private String numConta;
	private TipoConta tc;
	private Cliente cliente;
	private Banco banco;
	private ArrayList<Historico> historico;
	
	public Conta(Banco banco, Cliente cliente, TipoConta tc, String numConta) {
		this.historico = new ArrayList<Historico>();
		this.numConta = numConta;
		this.cliente = cliente;
		this.banco = banco;
		this.tc = tc;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public float getLimite() {
		return limite;
	}
	
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public String getNumConta() {
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public TipoConta getTipoDeConta() {
		return tc;
	}

	public void setTipoDeConta(TipoConta tipoDeConta) {
		this.tc = tipoDeConta;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		historico.add(new Historico(TipoTransacao.SAQUE, valor));
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		historico.add(new Historico(TipoTransacao.DEPOSITO, valor));
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		historico.add(new Historico(TipoTransacao.TRANSFERENCIA, valor));
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("- E X T R A T O   B A N C A R I O  ");
		System.out.println("-----------------------------------");
		System.out.println("- Cliente: " + this.getCliente().getNome());
		System.out.println("- Banco:   " + banco.getNomeBanco());
		System.out.println("- Agencia: " + banco.getAgencia());
		System.out.println("- N*Conta: " + this.getNumConta());
		System.out.println("-----------------------------------");
		System.out.println("- DATA       TRANSACAO  DOC  VALOR");
		System.out.println("-----------------------------------");
		for(int i = 0; i < historico.size(); i++) {
			System.out.println(
					"- "+ historico.get(i).getDate() + "  " 
						+ historico.get(i).getTt()   + "  " 
						+ historico.get(i).getDoc()   + "  " 
						+ historico.get(i).getValor()
			);
		}
		System.out.println("-----------------------------------");
		System.out.println("- SALDO ATUAL:             " +  this.getSaldo());
		System.out.println("- LIMITE:                  " +  this.getLimite());
		System.out.println("- SALDO + LIMITE:          " + (this.getLimite() + this.getSaldo()));
		System.out.println("-----------------------------------");
	}

	public void dadosDaConta() {
		System.out.println("- D A D O S   D A   C O N T A      ");
		System.out.println("-----------------------------------");
		System.out.println("- Cliente: " + cliente.getNome());
		System.out.println("- N*Banco: " + banco.getNumBanco());
		System.out.println("- N*Conta: " + this.numConta);
		System.out.println("- Agencia: " + banco.getAgencia());
		System.out.println("- Banco:   " + banco.getNomeBanco());
		System.out.println("- Saldo:   " + this.getSaldo());
		System.out.println("- Limite:  " + this.getLimite());
		System.out.println("- Tipo de Conta: " + this.getTipoDeConta());
		System.out.println("-----------------------------------");
	}
}
