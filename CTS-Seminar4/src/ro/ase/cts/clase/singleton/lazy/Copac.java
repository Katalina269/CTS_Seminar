package ro.ase.cts.clase.singleton.lazy;


public class Copac {
	private String denumire;
	private int varsta;
	private String regn;
	
	private static Copac instanta = null;
	
	private Copac(String denumire, int varsta, String regn) {
		super();
		this.denumire = denumire;
		this.varsta = varsta;
		this.regn = regn;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getRegn() {
		return regn;
	}

	public void setRegn(String regn) {
		this.regn = regn;
	}
	
	//returneaza instanta initializata la inceput

	 public static synchronized Copac getInstanta(String denumire,int varsta, String regn) {
	    	if(instanta == null) {
	    		instanta = new Copac(denumire,varsta,regn);
	    	}
	    	return instanta;
	    }
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Copac [denumire=");
		builder.append(denumire);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", regn=");
		builder.append(regn);
		builder.append("]");
		return builder.toString();
	}
	
}
