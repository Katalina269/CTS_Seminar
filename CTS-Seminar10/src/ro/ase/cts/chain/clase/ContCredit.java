package ro.ase.cts.chain.clase;

public class ContCredit extends Cont{

	public ContCredit(String titular, float sold) {
		super(titular, sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		if(super.getSold()>suma) {
			System.out.println("S-a realizat plata de "+suma+" din contul de credit");
			super.setSold(super.getSold()-suma);
		}else {
			super.getNextCont().realizeazaPlata(suma);
		}
		
	}

}
