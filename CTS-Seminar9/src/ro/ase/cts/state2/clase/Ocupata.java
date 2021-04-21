package ro.ase.cts.state2.clase;

public class Ocupata implements IStareMasa {

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof Rezervata) {
			System.out.println("Masa cu numarul "+ masa.getCodMasa()+ " a fost ocupata");
			masa.setStare(this);
		} else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}

}
