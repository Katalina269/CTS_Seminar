package ro.ase.cts.flyweight.clase;

public class Client implements FlyWeightAbstract {
	
	private String nume;
	private String telefon;
	private String adresaEmail;
	
	
	
	public Client(String nume, String telefon, String adresaEmail) {
		super();
		this.nume = nume;
		this.telefon = telefon;
		this.adresaEmail = adresaEmail;
	}

	@Override
	public void afiseazainformatii(Rezervare rezervare) {
		System.out.println(this.toString()+" "+rezervare.toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", telefon=");
		builder.append(telefon);
		builder.append(", adresaEmail=");
		builder.append(adresaEmail);
		builder.append("]");
		return builder.toString();
	}
	

}