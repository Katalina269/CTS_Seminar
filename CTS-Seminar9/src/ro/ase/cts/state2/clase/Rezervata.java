package ro.ase.cts.state2.clase;

public class Rezervata implements IStareMasa {

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof Libera) {
			System.out.println("Masa cu numarul "+ masa.getCodMasa()+ " a fost rezervata.");
			masa.setStare(this);
		} else {
			System.out.println("Masa nu poate fi rezervata! ");
		}
	}

}
