package ujsagok;

public final class Hetilap extends Ujsag {
	private int hetHanyadikNpjanJelenikMeg;

	public Hetilap(int ar, String nev, String kiado, int hetHanyadikNpjanJelenikMeg) {
		super(ar, nev, kiado);
		this.hetHanyadikNpjanJelenikMeg = hetHanyadikNpjanJelenikMeg;
	}

	@Override
	public double afaTartalomSzamit() {
		// TODO Auto-generated method stub
		return getAr()/105;
	}

	@Override
	public String toString() {
		return "Hetilap h�t H�nyadik Napj�nm jelenik meg: " + hetHanyadikNpjanJelenikMeg + ", �ra: " + getAr()+", kiad�: "+getKiado()+", neve: "+getNev();
	}
	
	
}
