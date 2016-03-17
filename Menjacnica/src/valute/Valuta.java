package valute;

import java.util.LinkedList;

import kursevi.Kurs;

public class Valuta {

	String naziv;
	String skraceni_naziv;
	LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceni_naziv() {
		return skraceni_naziv;
	}
	public void setSkraceni_naziv(String skraceni_naziv) {
		this.skraceni_naziv = skraceni_naziv;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		this.kursevi = kursevi;
	}
	
	
}
