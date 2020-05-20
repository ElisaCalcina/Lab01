package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	List<String> parole;
		
	public Parole() {
		parole= new LinkedList<String>();
	}
	
	//metodo per aggiungere la stringa alla lista
	public void addParola(String p) {
		parole.add(p);
	}
	
	//metodo per ottenere la lista di stringhe ordinate seguendo ordine alfabetico
	public List<String> getElenco() {
		Collections.sort(parole);
		return parole;
	}
	
	//metodo per eliminare la stringa dalla lista di stringhe
	public void reset() {
		parole.clear();
	}
	
	//metodo per rimuovere una parola
	public void removeParola(String string) {
		parole.remove(string);
	}


}
