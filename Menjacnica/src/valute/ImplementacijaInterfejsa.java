package valute;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.MenjacnicaInterfejs;
import kursevi.Kurs;
import valute.Valuta;

public class ImplementacijaInterfejsa implements MenjacnicaInterfejs {

	public LinkedList<Kurs> dodajKurs(LinkedList<Kurs> kursevi, Kurs k) {

		if (k != null){
			kursevi.add(k);
		}
		return kursevi;

	}

	@Override
	public LinkedList<Kurs> izbrisiKurs(LinkedList<Kurs> kursevi, Kurs k) {
		kursevi.remove(k);
		return kursevi;
	}

	@Override
	public Kurs pronadjiKurs(LinkedList<Kurs> kursevi, GregorianCalendar k) {
		for (int i = 0; i < kursevi.size(); i++) {
			if (kursevi.get(i).getDatum().equals(k)) {
				return kursevi.get(i);
			}
		}
		return null;
	}
}
