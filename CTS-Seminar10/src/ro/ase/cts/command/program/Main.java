package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContBancar  contBancar = new ContBancar("Kata",1500);
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new ComandaConstituire(contBancar,750));
		manager.invoca(new ComandaDepunere(contBancar,150));
		manager.executaComanda();
		manager.invoca(new ComandaRetragere(contBancar, 75));
		manager.executaComanda();
		manager.executaComanda();
		

	}

}
