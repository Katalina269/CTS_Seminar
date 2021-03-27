package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.Client;

public class Program {
	
	public static void main(String[] args) {
		Client client1 = new Client("Ceban","Catalina",21,510);
	    Client client2 = (Client) client1.copiaza();
	    System.out.println("Instantele de mai jos sunt diferite/ au referinte diferite !!! \n   Difera de Singleton, care utilizeaza o sigura instanta in spate");
	    System.out.println(client1.toString());
	    System.out.println(client2.toString());
	    
	    Bilet b1 = new Bilet(23,"echipa A", "Echipa B", " 13:30");
	    Bilet b2 = (Bilet) b1.copiaza();
	    b2.setCod(222);
	    Bilet b3 = (Bilet) b1.copiaza();
	    System.out.println(b1);
	    System.out.println(b2);
	    System.out.println(b3);
	}

}
