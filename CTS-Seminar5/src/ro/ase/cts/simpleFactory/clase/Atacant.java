package ro.ase.cts.simpleFactory.clase;

public class Atacant extends Jucator { 
	public Atacant(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		return "Atacant [=" + getNume() + "]";
	}

}
