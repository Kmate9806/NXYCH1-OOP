package hazi1;

import java.util.Scanner;

public class futo {

	public static void main(String[] args) {
			
		Szemely szem = new Szemely();
	
		Scanner input = new Scanner(System.in);
		int suly;
		do {
			System.out.println("Adjon meg egy testt�meget 1 es 200 kg kozott");
			while (!input.hasNextInt()) {
				System.out.println("That's not a number");
				input.next();
			}
			suly = input.nextInt();
		} while (suly < 1 || suly > 200);
		System.out.println("suly = " + suly);
		
		double magassag;
		do {
			System.out.println("Adjon meg egy magass�got 1 �s 2,3 m�ter k�z�tt");
			while (!input.hasNextDouble()) {
				System.out.println("That's not a number");
				input.next();
			}
			magassag = input.nextDouble();
		} while (magassag < 1 || magassag > 2.3);
		System.out.println("magassag = " + magassag);
		
		szem.setNev("Mate");
		szem.setMagassag(magassag);
		szem.setSuly(suly);
		
		System.out.println(szem.getTti());
		System.out.println(szem.getAlkat());
		System.out.println(szem.getAdatok());

	}

}
