package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libretto = new Libretto();
		libretto.addVoto(new Voto("Analisi 1", 30, LocalDate.of(2021, 2, 5)));
		libretto.addVoto(new Voto("Fisica 1", 25, LocalDate.of(2021, 2, 8)));
		libretto.votoPunteggio(25);
		System.out.println(libretto.cercaVoto("Fisica 1"));
		Voto v1 = new Voto("Fisica 1", 25, LocalDate.of(2021, 2, 8));
		if(libretto.votoEsistente(v1))
			System.out.println("Esiste");
		Voto v2 = new Voto("Fisica 1", 20, LocalDate.of(2021, 2, 8));
		if(libretto.votoConflitto(v2))
			System.out.println("Conflitto");
		libretto.addVoto(new Voto("Fisica 1", 20, LocalDate.of(2021, 2, 8)));
		libretto.ordinaVoti();
	}
}
