package ro.ase.cts.facade.clase;

public class BirouDeCredite {
	public static boolean areCredite(Persoana p) {
		int cifra = Integer.parseInt(""+p.getCnp().charAt(8));
		return cifra%2==0;
	}

}
