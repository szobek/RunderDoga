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
		return "Hetilap hét Hányadik Napjánm jelenik meg: " + hetHanyadikNpjanJelenikMeg + ", ára: " + getAr()+", kiadó: "+getKiado()+", neve: "+getNev();
	}
	
	
}
