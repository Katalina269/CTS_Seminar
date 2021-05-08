package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cont contCurent = new ContCurent("Cata", 100);
		Cont contEconomii = new ContEconomii("Cata", 200);
		Cont contCredit = new ContCredit("Cata", 500);
		Cont contIndisponibil = new ContIndisponibil("Cata");
		
		contCurent.setNextCont(contEconomii);
		contEconomii.setNextCont(contCredit);
		contCredit.setNextCont(contIndisponibil);
		
		contCurent.realizeazaPlata(50);
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(300);
		contCurent.realizeazaPlata(600);
	}

}
