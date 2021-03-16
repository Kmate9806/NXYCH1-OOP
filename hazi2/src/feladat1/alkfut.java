package feladat1;

public class alkfut {

	public static void main(String[] args) {
		
		// innen hazi feladat 
		
	    alkalmazott alkhf = new alkalmazott();
	    
	   // pointer az alkalmazott konstruktor fizetesere amit a 2. konstruktor használ fel
	    alkalmazott	a = alkhf;
	   
	    alkhf.setNev("Hazi Feladat ");
	    alkhf.setFizetes(25000);
	    
	    System.out.println(" innen hazi feladat resze: ");
	    
	    System.out.println(alkhf);
	    System.out.println(a);
	
	    System.out.println("eddig volt a hazi resze: ");
		
	    
	    // eddig hazi feladat
	   
	    System.out.println();
	
	    alkalmazott alk = new alkalmazott();
		
		
		
		alk.setNev("Mate");
		alk.setFizetes(1000);
		
		
	    
	    System.out.println(alk.getAdatok());
	
	alk.fizNovel(2000);
	System.out.println(alk.getAdatok());
	
	
	fizhatarok(alk);

	System.out.println("Az ado merteke: " + alk.getAdo());
	
	alkalmazott alk2 = new alkalmazott();
	alk2.setNev("Kira");
	alk2.setFizetes(1000);
	
	fiznagyobb(alk, alk2);
			
	
}

private static void fiznagyobb(alkalmazott alk, alkalmazott alk2) {
	if(alk.getFizNagyobbMasikAlk(alk2))
	
		System.out.println("Alk fizetese nagyobb" +alk.getAdatok());
	else
		System.out.println("Kira nak nagyobb"+alk2.getAdatok());
}

private static void fizhatarok(alkalmazott alk) {
	if (alk.getFizHatarokKozott(1000, 3000))
	System.out.println("Igen a fizetes a hatarok koze esik!");
	else
		System.out.println("Nem esik a hatarok koze ");
}




	}


