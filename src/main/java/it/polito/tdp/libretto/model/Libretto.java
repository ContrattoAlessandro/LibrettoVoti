package it.polito.tdp.libretto.model;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Libretto {

	List<Voto> voti;
	
	public Libretto() {
		voti = new LinkedList<Voto>();
	}
	
	public void addVoto(Voto v) {
		voti.add(v);
	}
	
	public int cercaVoto(String nomeCorso) {
		int punteggio = 0;
		for(Voto v: voti) {
			if(v.getCorso().equals(nomeCorso))
				punteggio =  v.getPunteggio();
		}
		return punteggio;
		
	}
	
	public void votoPunteggio (int punteggio) {
		for(Voto v : voti) {
			if(v.getPunteggio() == punteggio)
				System.out.println(v);
		}
	}
	
	public boolean votoEsistente(Voto v) {
		boolean flag = false;
		for (Voto vv : voti) {
			if(vv.getCorso().equals(v.getCorso()) && vv.getPunteggio() == v.getPunteggio())
				flag = true;
		}
		return flag;	
	}
	
	public boolean votoConflitto(Voto v) {
		boolean flag = false;
		for (Voto vv : voti) {
			if(vv.getCorso().equals(v.getCorso()) && vv.getPunteggio() != v.getPunteggio())
				flag = true;
		}
		return flag;	
	}
	
	public void addMigliorato(Voto v) {
		if(voti.contains(v) == false)
			voti.add(v);
	}
	
	public void cancellaVoti(int punteggio) {
		for(Voto v : voti) {
			if(v.getPunteggio() < 24)
				voti.remove(v);
		}
	}
	
	public void ordinaVoti() {
		LinkedList<Voto> voti2 = new LinkedList<Voto>(voti);
		LinkedList<Voto> voti3 = new LinkedList<Voto>();
		voti.sort(Comparator.comparing(Voto::getCorso));
		voti2.sort(Comparator.comparing(Voto::getPunteggio));
		Collections.reverse(voti2);
		for(Voto v : voti) {
			for(Voto v2 : voti2) {
				if(v.getCorso().equals(v2.getCorso()) && voti3.contains(v2) == false)
					voti3.add(v2);
			}
		}
		for(Voto v : voti3) {
			System.out.println(v);
		}
	}
	
}
