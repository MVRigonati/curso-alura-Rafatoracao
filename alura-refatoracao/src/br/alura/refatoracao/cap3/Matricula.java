package br.alura.refatoracao.cap3;

import java.util.Calendar;

public class Matricula {

	private boolean trial;
	private Calendar expiracao;
	
	public Matricula(boolean ehTrial, Calendar expiracao) {
		this.trial = ehTrial;
		this.expiracao = expiracao;
	}
	
	public boolean isTrial() {
		return trial;
	}
	
	public Calendar getExpiracao() {
		return expiracao;
	}
	
	public boolean isValid() {
		return !this.trial && this.expiracao.after(Calendar.getInstance());
	}
	
}