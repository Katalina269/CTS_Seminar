package ro.ase.cts.facade.clase;

import java.time.LocalDate;

public class Persoana {
	
	private String nume;
	private String cnp;
	
	
	public String getNume() {
		return nume;
	}
	public String getCnp() {
		return cnp;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persoana [nume=");
		builder.append(nume);
		builder.append(", cnp=");
		builder.append(cnp);
		builder.append("]");
		return builder.toString();
	}
	
	public int getVarsta() {
		return (LocalDate.now().getYear()-1900 + Integer.parseInt(""+cnp.charAt(1)+ cnp.charAt(2)));
	}
	public Persoana(String nume, String cnp) {
		super();
		this.nume = nume;
		this.cnp = cnp;
	}
	
	
	
	

}
