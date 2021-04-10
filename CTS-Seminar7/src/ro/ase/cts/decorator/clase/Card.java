package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract{
	private String titular;
	private int sold;

	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public void realizeazaPlataOnline(int suma) {
		if (suma != 0 && this.sold > suma) {
			System.out.println("Plata online in valoare de " + suma);
			sold -= suma;
		}
		else {
			System.out.println("Fonduri insuficiente!");
		}
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		if (suma != 0 && this.sold > suma) {
			System.out.println("Plata in valoare de " + suma);	
			sold -= suma;
		}
		else {
			System.out.println("Fonduri insuficiente!");
		}
		
	}
	
}