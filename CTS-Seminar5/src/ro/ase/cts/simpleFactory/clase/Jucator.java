package ro.ase.cts.simpleFactory.clase;

public abstract class Jucator {
	
	private String nume;
	
	public Jucator(String nume) {
		super();
		this.nume=nume;
	}
	public String getNume() {
		return nume;
	}

}
