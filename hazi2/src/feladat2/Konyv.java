package feladat2;

import java.time.LocalDate;

public class Konyv {
	private String cim;
	private String szerzo;
	private int ev;
	private double ar;
	LocalDate currentDate = LocalDate.now();
	int year = currentDate.getYear();
	
	
	public Konyv(String cim, String szerzo, int ev, double ar) {
		
		this.cim = cim;
		this.szerzo = szerzo;
		this.ev = ev;
		this.ar = ar;
	}


	public Konyv(String cim, String szerzo) {
		
		this.cim = cim;
		this.szerzo = szerzo;
		this.ar=2500;
		this.ev=year;
	}
	
	public Konyv() {
		super();
	}

// eddig tart a házi
	

	public void setarNovel(double szazalek) {
		
		 this.ar = this.ar + (ar *( szazalek / 100));
	}

	
	public String toString() {
		return "Konyv [cim=" + this.cim + ", szerzo=" + this.szerzo + ", ev=" + this.ev + ", ar=" + this.ar + "]";
	}


	public String getCim() {
		return cim;
	}


	public void setCim(String cim) {
		this.cim = cim;
	}


	public String getSzerzo() {
		return szerzo;
	}


	public void setSzerzo(String szerzo) {
		this.szerzo = szerzo;
	}


	public int getEv() {
		return ev;
	}


	public void setEv(int ev) {
		this.ev = ev;
	}


	public double getAr() {
		return ar;
	}


	public void setAr(double ar) {
		this.ar = ar;
	}
}
