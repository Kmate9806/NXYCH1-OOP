package hazi1;

import java.util.Scanner;

public class futo {

	public static void main(String[] args) {
			
		Szemely szem = new Szemely();
	
		Scanner input = new Scanner(System.in);
		int suly;
		do {
			System.out.println("Adjon meg egy testtömeget 1 es 200 kg kozott");
			while (!input.hasNextInt()) {
				System.out.println("That's not a number");
				input.next();
			}
			suly = input.nextInt();
		} while (suly < 1 || suly > 200);
		System.out.println("suly = " + suly);
		
		double magassag;
		do {
			System.out.println("Adjon meg egy magasságot 1 és 2,3 méter között");
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
