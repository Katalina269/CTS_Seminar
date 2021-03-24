package ro.ase.cts.program;

import ro.ase.cts.clase.ReceptieHotel;

public class Main {
	public static void main(String[] args) {
	ReceptieHotel receptie1 = ReceptieHotel.getInstanta();
	ReceptieHotel receptie2 = ReceptieHotel.getInstanta();
	System.out.println(receptie1.toString());
	System.out.println(receptie2.toString());
	receptie1.setNumeReceptioner("Maria");
	receptie2.setEtaj(3);
	System.out.println(receptie1.toString());
	System.out.println(receptie2.toString());
	
	}
}
