package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto {
	private String corso;
	private int punteggio;
	private LocalDate data;
	
	public Voto(String corso, int punteggio, LocalDate data) {
		this.corso = corso;
		this.punteggio = punteggio;
		this.data = data;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Voto [corso=" + corso + ", punteggio=" + punteggio + ", data=" + data + "]";
	} 
}
