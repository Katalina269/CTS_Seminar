package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Client;

public class Program {
	
	public static void main(String[] args) {
		Client client1 = new Client("Ceban","Catalina",21,510);
	    Client client2 = (Client) client1.copiaza();
	    System.out.println("Instantele de mai jos sunt diferite/ au referinte diferite !!! \n   Difera de Singleton, care utilizeaza o sigura instanta in spate");
	    System.out.println(client1.toString());
	    System.out.println(client2.toString());
	}

}
