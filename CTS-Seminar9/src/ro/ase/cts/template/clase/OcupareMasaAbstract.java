package ro.ase.cts.template.clase;

public  abstract class OcupareMasaAbstract {
 protected int codMasa;
 
 	abstract void curataMasa();
 	abstract void aseazaServetele();
 	abstract void aseazaTacamuri();
 	abstract void invitaPersoane();
 //metoda template = Atentie, e final :)
 public final void ocupaMasa() {
	 curataMasa();
	 aseazaServetele();
	 aseazaTacamuri();
	 invitaPersoane();
 }
public OcupareMasaAbstract(int codMasa) {
	super();
	this.codMasa = codMasa;
};
 
}
