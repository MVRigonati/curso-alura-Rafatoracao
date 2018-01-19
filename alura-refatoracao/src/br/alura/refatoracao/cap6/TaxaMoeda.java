package br.alura.refatoracao.cap6;

public enum TaxaMoeda {

	DOLAR(3.2),
	EURO(4);
	
	private double taxa;

	TaxaMoeda(double taxa) {
		this.taxa = taxa;
	}
	
	public double getTaxa() {
		return taxa;
	}
	
}
