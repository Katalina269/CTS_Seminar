package ro.ase.cts.memento;

public class Memento {
	private int nrSpectatori;
	private String echipa1;
	private String echipa2;
	public Memento(int nrSpectatori, String echipa1, String echipa2) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public String getEchipa1() {
		return echipa1;
	}
	public String getEchipa2() {
		return echipa2;
	}
	
	
	

}
