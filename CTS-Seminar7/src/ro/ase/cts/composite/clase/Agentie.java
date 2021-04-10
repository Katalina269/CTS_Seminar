package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Sediu{
	private String nume;
	private List<Sediu> sedii;
	
	public Agentie(String nume) {
		this.nume = nume;
		this.sedii = new ArrayList<>();
	}
	
	@Override
	public void descriere() {
		System.out.println("Agentie " + nume);
		for (Sediu sediu : sedii) {
			sediu.descriere();
		}
	}

	@Override
	public void adaugaSediu(Sediu sediu) throws Exception {
		sedii.add(sediu);
	}

	@Override
	public void stergeSediu(Sediu sediu) throws Exception {
		sedii.remove(sediu);
	}

	@Override
	public Sediu getSediu(int pozitie) throws Exception {
		if (pozitie >= 0 && pozitie <= sedii.size()) {
			return sedii.get(pozitie);
		}
		else {
			throw new Exception();
		}
	}

}
