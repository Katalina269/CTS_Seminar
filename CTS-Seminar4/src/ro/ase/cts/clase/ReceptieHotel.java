package ro.ase.cts.clase;

public class ReceptieHotel {
	//Singleton eager
	private String numeReceptioner;
	private int etaj;
	private String numeHotel;
	
	
	private static final ReceptieHotel instanta = new ReceptieHotel("Florin",1,"Floreasca");
	
	private ReceptieHotel(String numeReceptioner, int etaj, String numeHotel) {
		super();
		this.numeReceptioner = numeReceptioner;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}
	
	//returneaza instanta initializata la inceput

	public static ReceptieHotel getInstanta() {
		return instanta;
	}



	public String getNumeReceptioner() {
		return numeReceptioner;
	}

	public void setNumeReceptioner(String numeReceptioner) {
		this.numeReceptioner = numeReceptioner;
	}

	public int getEtaj() {
		return etaj;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	public String getNumeHotel() {
		return numeHotel;
	}

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReceptieHotel [numeReceptioner=");
		builder.append(numeReceptioner);
		builder.append(", etaj=");
		builder.append(etaj);
		builder.append(", numeHotel=");
		builder.append(numeHotel);
		builder.append("]");
		return builder.toString();
	}


	

}
