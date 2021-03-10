package hazi1;

public class Szemely {
	
	private String nev;
	private int suly;
	private double magassag;
	private String alkat;
	private double tti=0;
	

	
	public void setNev(String nev) {
		
		this.nev = nev;
	}
	
	public void setSuly(int suly) {
		
		this.suly = suly;
	}
	
    public void setMagassag(double magassag) {
		
		this.magassag = magassag;
	}
    
    public double getMagassag() {
		
		return this.magassag;
	}

	public String getNev() {
		
		return this.nev;
	}
	
	public int getSuly() {
		
		return this.suly;
	}




	public double getTti() {
	
	return tti = (double)suly/(magassag*magassag);
	
	}
	
	public String getAlkat() {
		
		if(tti<18.5) {
			
			alkat="sov�ny";
			
			return alkat;
		}
		if(tti>25) {
			
			alkat="k�v�r";
		
			return alkat;
		}
		else {
			alkat="norm�l";
			
			return alkat;
		}
		
	}

	public String getAdatok() {
	return "Nev: "+ nev +" s�ly: "+ suly + "magass�g: " + magassag + "tti: " + alkat ;
	
	}

}