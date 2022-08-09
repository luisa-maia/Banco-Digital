package BancoDigitalV2;

public interface ITransacao {
	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor, Conta contaDestino);
	void imprimirExtrato();
}
