package ro.ase.cts.facade.clase;

public class Politie {
	
	public static boolean esteUrmarit(Persoana p) {
		int cifraCnp = Integer.parseInt(""+p.getCnp().charAt(12));
		return cifraCnp%2==0;
	}

}
