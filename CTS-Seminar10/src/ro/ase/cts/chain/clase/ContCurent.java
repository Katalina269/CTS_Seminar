package ro.ase.cts.chain.clase;

public class ContCurent  extends Cont{
	
	public ContCurent( String titular, float suma) {
		super(titular,suma);
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
		if(super.getSold()>suma) {
			System.out.println("S-a realizat plata de "+suma+" din contul curent");
			super.setSold(super.getSold()-suma);
		}else {
			super.getNextCont().realizeazaPlata(suma);
		}
		
	}

}
