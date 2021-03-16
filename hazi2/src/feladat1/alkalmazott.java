package feladat1;

public class alkalmazott {

	private String nev;
	private int fizetes;
	
	  public alkalmazott() {
			
		}
	//innen h�zi feladat
	
	//alkalmazott konstruktor letrehozasa
 
	
   

   // Az alkalmazott konstruktor n�v el �s fizet�ssel
	public alkalmazott( String nev, int fizetes)
	{
		this.nev = nev;
		this.fizetes = fizetes;
	}
	// Az alkalmazott konstruktor csak n�v el
	public alkalmazott(String nev) {
		this.nev=nev ;

	}
	
	public String toString() {
		return "alkalmazott [nev=" + nev + ", fizetes=" + fizetes + "]";
	}
	
	//eddig volt h�zi feladat
	


	public void fizNovel(int fizNovekmeny)
	{
		fizetes += fizNovekmeny;
	}

	public String getAdatok() {
		return "Nev: "+ nev +" Fizetes: "+ fizetes;
		
	}
	
	public void setNev(String nev) {
		
		this.nev = nev;
	}
	
	public void setFizetes(int fizetes) {
		
		this.fizetes = fizetes;
	}
	
	public String getNev() {
		
		return this.nev;
	}
	
	public int getFiz() {
		
		return this.fizetes;
	}
	
	public boolean getFizHatarokKozott(int also, int felso) {
		
		if(this.fizetes <= felso && this.fizetes >=also)
			return true;
		
		return false;
		
	}
	
	public double getAdo() {
		return this.fizetes * (16 / 100.00);
		
	}
	
	public boolean getFizNagyobbMasikAlk(alkalmazott masik) {
		
		if(this.fizetes > masik.fizetes)
			return true;
		
		
		return false;
		
		
		 
	}
	
}
