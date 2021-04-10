package ro.ase.cts.facade.clase;

public class Facade {
  
	public static boolean esteAptaDeCredit(Persoana persoana) {
		if(persoana.getVarsta() >=18) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BirouDeCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
}
