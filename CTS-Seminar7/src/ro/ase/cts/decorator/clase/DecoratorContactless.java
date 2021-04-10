package ro.ase.cts.decorator.clase;

public class DecoratorContactless extends DecoratorAbstract{

	public DecoratorContactless(Card card) {
		super(card);
	}

	@Override
	public void platesteContactless(int suma) {
		if (suma != 0 && super.getCard().getSold() > suma) {
			System.out.println("Plata contractless in valoare de " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);
		}
		else {
			System.out.println("Fonduri insuficiente!");
		}
	}
}
