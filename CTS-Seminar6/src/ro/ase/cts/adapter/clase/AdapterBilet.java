package ro.ase.cts.adapter.clase;

public class AdapterBilet  extends Bilet implements BiletOnline{

	public AdapterBilet(float pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vindeBilet() {
		// TODO Auto-generated method stub
		super.vinde();
		
	}

	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		super.rezerva();
		
	}

}
