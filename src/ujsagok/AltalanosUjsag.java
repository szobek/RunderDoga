package ujsagok;

public final class AltalanosUjsag extends Ujsag {

	public static int osszesAltalanos;
	
	public AltalanosUjsag(int ar, String nev, String kiado) {
		super(ar, nev, kiado);
	}

	@Override
	public double afaTartalomSzamit() {
		return getAr()/105;
	}

	@Override
	public String toString() {
		return "AltalanosUjsag ára: " + getAr()+", kiadó: "+getKiado()+", neve: "+getNev();
	}

	
	
}
