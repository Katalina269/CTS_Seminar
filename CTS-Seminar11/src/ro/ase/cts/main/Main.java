package ro.ase.cts.main;

import ro.ase.cts.memento.ManagerMemento;
import ro.ase.cts.memento.Meci;
import ro.ase.cts.memento.Memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meci meci1 = new Meci(150,"Echipa 1", "Echipa2", 250,145);
		Memento memento = meci1.creareMemento();
		ManagerMemento  manager = new ManagerMemento();
		manager.adaugaMemento(memento);
		
		meci1.setNumarSpectatori(7500);
		meci1.setNumarBileteVandute(2780);
		meci1.setNumeEchipaGazda("Real");
		meci1.setNumeEchipaOaspeti("FCSB");
		
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getLastMemento());
		System.out.println(meci1.toString());
		
		

	}

}
