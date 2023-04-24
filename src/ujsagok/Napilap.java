package ujsagok;

public final class Napilap extends Ujsag{
	
	private int hetiMegjelenesSzam;
	
	
	
	
	public Napilap(int ar, String nev, String kiado, int hetiMegjelenesSzam) {
		super(ar, nev, kiado);
		this.hetiMegjelenesSzam = hetiMegjelenesSzam;
	}
	private final int hetiArkalkulacio(){
		return getAr()*hetiMegjelenesSzam;
	}
	
	public int getHetiMegjelenesSzam() {
		return hetiMegjelenesSzam;
	}
	@Override
	public double afaTartalomSzamit() {
		return getAr()- (getAr()/105);
		
	}
	
	public void setHetiMegjelenesSzam(int hetiMegjelenesSzam) {
		if(hetiMegjelenesSzam>=4) {
			this.hetiMegjelenesSzam = hetiMegjelenesSzam;	
		}else {
			
		}
		
		
	}
	@Override
	public String toString() {
		return "Napilap heti Megjelenés Szám:" + hetiMegjelenesSzam + ", ára" + getAr() + "Ft, neve: "+getNev()+", kiadó: "+getKiado();
	}
	
	

}
