package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Client client = new Client("Florin", new PlataCard());
	        client.platesteNota(50);
	        client.setModPlata(new PlataCash());
	        client.platesteNota(120);
	}

}
