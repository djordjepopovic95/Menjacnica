package interfejsi;

import java.util.LinkedList;

import kursevi.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKurs(LinkedList<Kurs> kursevi, Kurs k);
	public void izbrisiKurs(LinkedList<Kurs> kursevi, Kurs k);
	public Kurs pronadjiKurs(LinkedList<Kurs> kursevi, Kurs k);
}
