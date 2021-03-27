package ro.ase.cts.simpleFactory.Program;

import ro.ase.cts.simpleFactory.clase.Jucator;
import ro.ase.cts.simpleFactory.clase.JucatorFactory;
import ro.ase.cts.simpleFactory.clase.TipJucator;

public class Program {
	
	public static void main(String args[]) {
		try {
			JucatorFactory f1 = new JucatorFactory();
			Jucator jucator1 = f1.createJucator(TipJucator.Portar, "Florin");
			Jucator jucator2 = f1.createJucator(TipJucator.Fundas, "Dorin");
			Jucator jucator3 = f1.createJucator(TipJucator.Atacant, "Alin");
		System.out.println(jucator1.toString());
		System.out.println(jucator2.toString());
		System.out.println(jucator3.toString());
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
