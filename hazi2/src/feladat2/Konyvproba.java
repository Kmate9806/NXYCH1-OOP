package feladat2;

public class Konyvproba {

	public static void main(String[] args) {
		Konyv hfk1 = new Konyv("Mate konyve","Mate",2019,2500.0);
		Konyv hfk2 = new Konyv("Mate 2. konyve","Mate");
		
		Konyv k1 = new Konyv();
		k1.setSzerzo("Tibi");
		k1.setCim("Tibi elete");
		k1.setAr(1000);
		k1.setEv(2022);
		
		// Egy sima adatos kiiratás
		System.out.println(hfk1.toString());
		
		// Az év az aktuális év kiiratása
		System.out.println(hfk2.toString());
		
		System.out.println();
		
		System.out.println(k1.toString());
		k1.setarNovel(1);
		System.out.println(k1.toString());
	}

}
