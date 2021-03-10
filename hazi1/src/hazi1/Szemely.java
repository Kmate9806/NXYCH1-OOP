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
			
			alkat="sovány";
			
			return alkat;
		}
		if(tti>25) {
			
			alkat="kövér";
		
			return alkat;
		}
		else {
			alkat="normál";
			
			return alkat;
		}
		
	}

	public String getAdatok() {
	return "Nev: "+ nev +" súly: "+ suly + "magasság: " + magassag + "tti: " + alkat ;
	
	}

}