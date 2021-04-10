package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BirouDeCredite;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoana  persoana = new Persoana("Florin","2990206226865");
		if(persoana.getVarsta()>18) {
			if(!Politie.esteUrmarit(persoana)) {
				if(!BirouDeCredite.areCredite(persoana)) {
					System.out.println("Persoana " +persoana.getNume()+ " este apta pentru a primi credit");
					
				} else {
					System.out.println("Persoana" +persoana.getNume() + " are antecedente penale sau un alt credit");
				}
			}
		}
		
		Persoana persoana2 = new Persoana("Dan","2980202369543");
		if(Facade.esteAptaDeCredit(persoana2))
		System.out.println("Persoana poate primi creditul solicitat");
		else 
			System.out.println("Persoana data nu respecta conditiile pentru primire credit");

	}

}
