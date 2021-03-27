package ro.ase.cts.prototype.clase;

public class Client implements ClientPrototype {
	
	private String nume;
	private String prenume;
	private int varsta;
	private int cod;
	

	@Override
	public ClientPrototype copiaza() {
		// TODO Auto-generated method stub
		Client client = new Client();
		client.nume = this.nume;
		client.prenume = this.prenume;
		client.varsta = this.varsta;
		client.cod = this.cod;
		
		return client;
	}
	
	// si ca sa nu creeze obiecte random care nu sunt validate = > private
	private Client() {
		//asta nu face validari
		
	}

	public Client(String nume, String prenume, int varsta, int cod) {
		//aici se fac validari in foarte multe cazuri
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.cod = cod;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", cod=");
		builder.append(cod);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
