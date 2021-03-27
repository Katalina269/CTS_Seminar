package ro.ase.cts.prototype.clase;

public class Bilet implements Copiator {

	private int cod;
	private String echipaA;
	private String echipaB;
	private String ora;
	
	public Bilet(int cod, String echipaA, String echipaB, String ora) {
		super();
		this.cod = cod;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
		this.ora = ora;
	}
	private Bilet() {
		
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getEchipaA() {
		return echipaA;
	}
	public void setEchipaA(String echipaA) {
		this.echipaA = echipaA;
	}
	public String getEchipaB() {
		return echipaB;
	}
	public void setEchipaB(String echipaB) {
		this.echipaB = echipaB;
	}
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora = ora;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [cod=");
		builder.append(cod);
		builder.append(", echipaA=");
		builder.append(echipaA);
		builder.append(", echipaB=");
		builder.append(echipaB);
		builder.append(", ora=");
		builder.append(ora);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public Copiator copiaza() {
		// TODO Auto-generated method stub
		Bilet b1 = new Bilet();
		b1.cod = this.cod;
		b1.echipaA=this.echipaA;
		b1.echipaB = this.echipaB;
		b1.ora = this.ora;
		
		return b1;
	
	}
	
	
	
}
