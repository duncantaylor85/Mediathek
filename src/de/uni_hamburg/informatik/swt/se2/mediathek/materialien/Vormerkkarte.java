package de.uni_hamburg.informatik.swt.se2.mediathek.materialien;

import java.util.ArrayList;

import de.uni_hamburg.informatik.swt.se2.mediathek.materialien.medien.Medium;

public class Vormerkkarte {
	private final Medium _medium;
	private ArrayList<Kunde> _kunden;
	private final int MAXANZAHLKUNDEN = 3;
	
	public Vormerkkarte(Medium medium, Kunde kunde) {
		_medium = medium;
		_kunden = new ArrayList<Kunde>();
		_kunden.add(kunde);
	}
	
	/**
	 * 
	 * @param vormerker Der Kunde, der geprüft werden soll, ob er das Medium schon vorgermerkt hat.
	 * @return true wenn der Kunde das Medium schon vorgemerkt hat, sonst falsch
	 */
	public boolean isKundeEnthalten(Kunde vormerker) {
		for(Kunde kunde: _kunden) {
			if(kunde.equals(vormerker)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @return true wenn die Vormerkkarte die Maximum Anzahl von Kunden erreicht hat, sonst falsch
	 */
	public boolean istVormerkkarteVoll() {
		return _kunden.size() == MAXANZAHLKUNDEN;
	}
	
	/**
	 * 
	 * @param kunde Der Kunde, der auf die Vormerkliste hingefügt werden soll
	 */
	public void fuegeKundehinzu(Kunde kunde){
		if(_kunden.size() < MAXANZAHLKUNDEN) {
			_kunden.add(kunde);
		}
	}
	
	/**
	 * Entfernt den ersten Kunde von der Vormerkliste
	 */
	public void entferneErsteKundeVonListe() {
		_kunden.remove(0);
	}
	
	/**
	 * 
	 * @param position Die Position in der Vormerkliste
	 * @return gibt den Kunde an der angegebener Position zurück, sonnst gibt null zurück
	 */
	public Kunde getKundeAnPosition(int position) {
		if(_kunden.size() > position) {
			return _kunden.get(position);
		}
		return null;
	}
	
	/**
	 * 
	 * @return Gibt das Medium von der Vormerkkarte zurück
	 */
	public Medium getMedium() {
		return _medium;
	}
}
