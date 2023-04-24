package doga;

import ujsagok.FalOlvasas;
import ujsagok.Hetilap;
import ujsagok.Napilap;
import ujsagok.Ujsag;

public class Main {
	static Ujsag[] ujsagok;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().ujsagLista();
//new Main().mindenHetilap(); // Feladat 4
// new Main().mindenNapiLapAmiMinimum6(); // Feladat 5
		//new Main().legdragabb(); // Feladat 7
		new Main().elsoLapEsKoltseg(); // Feladat 8

	}

	private void ujsagLista() {
		FalOlvasas fajlolvasas = new FalOlvasas();
		ujsagok = fajlolvasas.fajlOlvas("ujsagok.csv", "-");

	}

	private void mindenHetilap() {
		for (Ujsag elem : ujsagok) {
			if (elem instanceof Hetilap) {
				System.out.println(elem.toString());
			}
		}

	}

	private void mindenNapiLapAmiMinimum6() {
		for (Ujsag elem : ujsagok) {
			if (elem instanceof Napilap && ((Napilap) elem).getHetiMegjelenesSzam() >= 6) {
				System.out.println(elem.toString());
			}
		}

	}

	private void osszesAltalanosUjsagDarab() {

	}

	private void legdragabb() {
		int draga = 0;

		Ujsag ujsag = null;
		for (Ujsag elem : ujsagok) {
			if (elem.getAr() > draga) {
				ujsag = elem;
				draga = elem.getAr();
			}
		}
		System.out.println("A legdrágább: " + ujsag.getNev() + " az ára: " + ujsag.getAr() + "Ft, az áfa: "
				+ ujsag.afaTartalomSzamit());
	}

	private void elsoLapEsKoltseg() {
		int index=0;
		while(!(ujsagok[index] instanceof Napilap)) {index++;}
		System.out.println("az elsõ neve: "+ujsagok[index].getNev()+", a heti költség:"+((Napilap) ujsagok[index]).getHetiMegjelenesSzam()*ujsagok[index].getAr());
		
	}
}
