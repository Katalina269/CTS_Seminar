package ro.ase.cts.adapter.clase;

public class AdapterObiectBilet  implements BiletOnline{
	
	private Bilet bilet;
	
	public AdapterObiectBilet(Bilet bilet) {
		this.bilet = bilet;
	}

	@Override
	public void vindeBilet() {
		// TODO Auto-generated method stub
		this.bilet.vinde();
		
		
	}

	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		this.bilet.rezerva();
		
	}

}
