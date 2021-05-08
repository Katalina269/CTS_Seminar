package ro.ase.cts.chain.clase;

public abstract class Cont {
	private String titular;
	private float sold;
	private Cont nextCont;
	
	public Cont(String titular, float sold) {
		super();
		this.titular = titular;
		this.sold = sold;
		this.nextCont = null;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}

	public Cont getNextCont() {
		return nextCont;
	}

	public void setNextCont(Cont nextCont) {
		this.nextCont = nextCont;
	}
	
	public abstract void realizeazaPlata(float suma);
	
	
	
	
	

}
