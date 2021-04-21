package ro.ase.cts.template.clase;

public class OcupaMasa extends OcupareMasaAbstract {

	public OcupaMasa(int codMasa) {
		super(codMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Masa cu numarul "+ this.codMasa+ " este curatata");
		
	}

	@Override
	void aseazaServetele() {
		// TODO Auto-generated method stub
		System.out.println("Masa cu numarul "+ this.codMasa+ " a primit servetele");
		
	}

	@Override
	void aseazaTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Masa cu numarul " + this.codMasa+ " a primit tacamuri");
		
	}

	@Override
	void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Pentru masa cu numarul " + this.codMasa+ " au fost invitate persoanele");
		
	}

}
