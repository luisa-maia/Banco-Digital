package BancoDigitalV2;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco(
				"Banco do Brasil",
				"01011",
				"123-2"
		);
		

		Cliente cliente = new Cliente(
				"Dannylo Torres",
				"example@example.com",
				"123.456.789-10",
				"(00) 4002-8922",
				22
		);
		

		Conta conta = new Conta(
				banco,
				cliente,
				TipoConta.CORRENTE,
				"123123"
		);
		

		banco.addConta(conta);
		

		cliente.dadosDoCliente();
		
		conta.dadosDaConta();
		conta.depositar(1000);
		conta.sacar(50);
		conta.imprimirExtrato();
		
		banco.exibirContas();
		
	}

}
