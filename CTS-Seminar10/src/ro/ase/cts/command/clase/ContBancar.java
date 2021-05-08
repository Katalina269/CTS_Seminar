package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float sold;
	
	

	public ContBancar(String detinator,float sold) {
		super();
		this.detinator = detinator;
		this.sold=sold;
	}

	@Override
	public String toString() {
		return "ContBancar [detinator=" + detinator + "]";
	}
	
	public void constituire(float suma) {
		System.out.println("S-a constituit contul cu suma "+suma);
		sold=suma;
	}
	public void retragere(float suma) {
		if(sold>=suma) {
			System.out.println("S-a retras din cont suma "+suma);
			sold=sold-suma;
		}else {
			System.out.println("Fonduri insuficiente pentru "+suma);
		}
		
	}
	public void depunere(float suma) {
		System.out.println("S-a depus in cont suma "+suma);
		sold=sold+suma;
	}

}