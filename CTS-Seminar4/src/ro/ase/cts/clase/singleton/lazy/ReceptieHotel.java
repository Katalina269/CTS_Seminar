package ro.ase.cts.clase.singleton.lazy;

public class ReceptieHotel {
	// initializare la momentul cel mai tarziu => lazy 
	// nu putem folosi cand avem mai multe threaduri, nu stim care va apela metoda
	// se incalca SingleRespons pentru ca apeleaza de 2 ori constructorul, solutie => synchronized 
	// drept rezultat avem threadSafe singleton
	private String numeReceptioner;
	private int etaj;
	private String numeHotel;
	
	private static ReceptieHotel instanta = null;

	private ReceptieHotel(String numeReceptioner, int etaj, String numeHotel) {
		super();
		this.numeReceptioner = numeReceptioner;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}

	public String getNumeReceptioner() {
		return numeReceptioner;
	}

	public int getEtaj() {
		return etaj;
	}

	public String getNumeHotel() {
		return numeHotel;
	}

	
	public void setNumeReceptioner(String numeReceptioner) {
		this.numeReceptioner = numeReceptioner;
	}

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}
	
    public static synchronized ReceptieHotel getInstanta(String numeReceptioner,int etaj, String numeHotel) {
    	if(instanta == null) {
    		instanta = new ReceptieHotel(numeReceptioner,etaj,numeHotel);
    	}
    	return instanta;
    }
	
	
	

}
