package interfejsi;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import kursevi.Kurs;

public interface MenjacnicaInterfejs {

	public LinkedList<Kurs> dodajKurs(LinkedList<Kurs> kursevi, Kurs k);
	public LinkedList<Kurs> izbrisiKurs(LinkedList<Kurs> kursevi, Kurs k);
	public Kurs pronadjiKurs(LinkedList<Kurs> kursevi, GregorianCalendar k);
}
