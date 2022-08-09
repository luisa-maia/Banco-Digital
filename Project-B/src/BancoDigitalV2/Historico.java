package BancoDigitalV2;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Historico {
	private String date;
	private TipoTransacao tt;
	private int doc;
	private double valor;
	
	public Historico(TipoTransacao tt, double valor) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Random random = new Random();
		this.date = sdf.format(new Date());
		this.tt = tt;
		this.doc = random.nextInt(99);
		this.valor = valor;
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
	
	public int getDoc() {
		return doc;
	}
	
	public void setDoc(int doc) {
		this.doc = doc;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
}