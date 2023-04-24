package ujsagok;

public abstract class Ujsag {

	private int ar;
	private String nev;
	private String kiado;
	
	
	
	public Ujsag(int ar, String nev, String kiado) {
		
		setAr(ar);;
		setNev(nev);
		setKiado(kiado);
	}

	public abstract double afaTartalomSzamit();

	public int getAr() {
		return ar;
	}

	public String getNev() {
		return nev;
	}

	public String getKiado() {
		return kiado;
	}

	public void setAr(int ar) {
		if(ar>0) {this.ar = ar;}
		
		
	}

	public void setNev(String nev) {
		if (!nev.equals(""))
			this.nev = nev;
	}

	public void setKiado(String kiado) {
		if(!kiado.equals(""))
			this.kiado = kiado;
		
	}
	
	
	
	
}
