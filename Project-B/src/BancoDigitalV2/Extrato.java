package BancoDigitalV2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Extrato {
	private Cliente cliente;
	private String numConta;
	private Banco banco;
	private String date;
	private TipoTransacao tt;
	private double valor;

	public Extrato(Cliente cliente, String numConta, Banco banco, TipoTransacao tt, double valor) {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		this.cliente = cliente;
		this.numConta = numConta;
		this.valor = valor;
		this.banco = banco;
		this.date = formatoData.format(new Date());
		this.tt = tt;
	}

	public String setNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TipoTransacao getTt() {
		return tt;
	}

	public void setTt(TipoTransacao tt) {
		this.tt = tt;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
