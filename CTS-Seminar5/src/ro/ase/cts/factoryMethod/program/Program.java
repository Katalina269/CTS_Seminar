package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.AtacantFactory;
import ro.ase.cts.factoryMethod.clase.Jucator;
import ro.ase.cts.factoryMethod.clase.JucatorFactory;
import ro.ase.cts.factoryMethod.clase.MijlocasFactory;
import ro.ase.cts.factoryMethod.clase.PortarFactory;

public class Program {
	
	public static void afiseazaJucator(JucatorFactory fabrica, String nume)
	{
		Jucator jucator1 = fabrica.creareJucator(nume);
		System.out.println(jucator1);
	}
	
	public static void main(String[] args) {
		afiseazaJucator(new PortarFactory(), "Florin");
		afiseazaJucator(new AtacantFactory(),"Ion");
		afiseazaJucator(new MijlocasFactory(), "Daniel");
	}
}
