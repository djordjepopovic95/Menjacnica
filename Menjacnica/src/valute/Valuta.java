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
		if (naziv != null && !naziv.isEmpty())
		this.naziv = naziv;
	}

	public String getSkraceni_naziv() {
		return skraceni_naziv;
	}

	public void setSkraceni_naziv(String skraceni_naziv) {
		if (skraceni_naziv != null && !skraceni_naziv.isEmpty())
		this.skraceni_naziv = skraceni_naziv;
	}

	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}

	public void setKursevi(LinkedList<Kurs> kursevi) {
		if (kursevi != null)
		this.kursevi = kursevi;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceni_naziv=" + skraceni_naziv + ", kursevi=" + kursevi + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceni_naziv == null) ? 0 : skraceni_naziv.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursevi == null) {
			if (other.kursevi != null)
				return false;
		} else if (!kursevi.equals(other.kursevi))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceni_naziv == null) {
			if (other.skraceni_naziv != null)
				return false;
		} else if (!skraceni_naziv.equals(other.skraceni_naziv))
			return false;
		return true;
	}

}
