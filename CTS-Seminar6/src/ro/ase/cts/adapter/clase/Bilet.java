package ro.ase.cts.adapter.clase;

public class Bilet {
	private float pret;
	
	public Bilet(float pret) {
		super();
		this.pret = pret;
	}
   public void rezerva() {
	   System.out.println("A fost rezervat un bilet cu pretul de " + pret);
   }
   public void vinde() {
	   System.out.println("A fost vandut un bilet cu pretul de " + pret);
   }
}
