package ro.ase.cts.decorator.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract{

	public DecoratorContactlessTelefon(Card card) {
		super(card);
	}

	@Override
	public void platesteContactless(int suma) {
		if (suma != 0 && super.getCard().getSold() > suma) {
			System.out.println("Plata contactless cu telefonul in valoare de " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
		else {
			System.out.println("Fonduri insuficiente!");
		}
	}

}