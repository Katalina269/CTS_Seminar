package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.AdapterObiectBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Program {
	public static void rezervaSiVindeBiletOnline(BiletOnline biletOnline) {
		biletOnline.rezervaBilet();
		biletOnline.vindeBilet();
		
	}
	
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bilet bilet=new Bilet(15.5f);
		rezervaSiVindeBiletLaCasa(bilet);
		
		BiletOnline biletOnline=new AdapterBilet(20.5f);
		rezervaSiVindeBiletOnline(biletOnline);
		
		System.out.println(" Adaptor obiecte");
		AdapterBilet adapterBilet = new AdapterBilet(30.2f);
		rezervaSiVindeBiletLaCasa(adapterBilet);
		
		BiletOnline bilet1 = new AdapterObiectBilet(bilet);
		rezervaSiVindeBiletOnline(bilet1);

	}

}
