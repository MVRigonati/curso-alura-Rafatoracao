package br.alura.refatoracao.cap5;

public class Fatura {

	private double valorMensal;
	private String cliente;

	public Fatura() {
	}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}

	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
 	public double emDolar() {
 		return this.converteMensal(2.7);
 	}
 	
 	public double emReais() {
		return this.valorMensal;
 	}
 	
 	private double converteMensal(double taxa) {
 		return this.valorMensal * taxa;
 	}

}