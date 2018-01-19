package br.alura.refatoracao.cap2;

import java.util.List;

public class Trem {

	private List<Vagao> vagoes;
	private int capacidade;
	
	public boolean lugaresDisponiveis(int reservas) {
		
		int lugaresLivres = capacidade - numLugaresReservados();;
		return lugaresLivres > reservas;
		
	}

	private int numLugaresReservados() {
		
		// Conta quantos lugares estão reservados
		int lugaresReservados = 0;
		for(Vagao vagao : vagoes) {
			lugaresReservados += vagao.numDeLugaresReservados();
		}
		return lugaresReservados;
		
	}
	
}