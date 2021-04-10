package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardAbstract{

	private Card card;
	
	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}
	
	@Override
	public void realizeazaPlataOnline(int suma) {
		card.realizeazaPlataOnline(suma);
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		card.realizeazaPlataNormala(suma);
	}
	
	public abstract void platesteContactless(int suma);
	
	protected Card getCard() {
		return this.card;
	}
}