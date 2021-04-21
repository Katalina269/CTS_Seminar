package ro.ase.cts.state2.clase;

public class Masa {
	private IStareMasa stare;
	private int codMasa;
	
	public Masa(int codMasa) {
		super();
		this.codMasa = codMasa;
		this.stare = new Libera();
	}

	public IStareMasa getStare() {
		return stare;
	}

	 void setStare(IStareMasa stare) {
		this.stare = stare;
	}

	public int getCodMasa() {
		return codMasa;
	}

	public void setCodMasa(int codMasa) {
		this.codMasa = codMasa;
	}
    public void rezervaMasa() {
    	Rezervata stareRezervata = new Rezervata();
    	stareRezervata.modificaStare(this);
    }
    public void ocupaMasa() {
    	Ocupata stareOcupata = new Ocupata();
    	stareOcupata.modificaStare(this);
    }
    public void elibereazaMasa() {
    	Libera stareLibera = new Libera();
    	stareLibera.modificaStare(this);
    }
    public void ridicaRezervare() {
    	ocupaMasa();
    }
}
