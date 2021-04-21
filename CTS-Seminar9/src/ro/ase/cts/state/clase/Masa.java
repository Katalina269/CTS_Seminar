package ro.ase.cts.state.clase;

public class Masa {
	private int codMasa;
	private IStareMasa stare;
	
	public Masa(int cod) {
		super();
		this.codMasa= cod;
		this.stare = new Libera();
	}

	public IStareMasa getStare() {
		return stare;
	}

	public void setStare(IStareMasa stare) {
		this.stare = stare;
	}
	
	public void ocupaMasa() {
		if(this.stare instanceof Rezervata) {
			System.out.println("Masa cu codul " +codMasa + "este ocupata");
			this.stare = new Ocupata();
		} else {
			System.out.println("Masa nu poate fi ocupata");
		}
		
	}
	public void rezervaMasa() {
		if(this.stare instanceof Libera) {
			System.out.println("Masa cu codul " +codMasa + "este rezervata");
			this.stare = new Rezervata();
		} else {
			System.out.println("Masa nu poate fi rezervatata!");
		}
		
	}
	public void elibereazaMasa() {
		if(!(this.stare instanceof Libera)) {
			System.out.println("Masa cu codul " + codMasa + " a fost eliberata");
			this.stare = new Libera();
		} else {
			System.out.println("Masa  nu poate fi elibera");
		}
		
	}
	public void ocupaMasaFaraRezervare() {
		if(this.stare instanceof Libera) {
			System.out.println("Masa cu numarul " + codMasa + " a fost ocupata fara rezervare.");
			this.stare = new Ocupata();
		} else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}

}
