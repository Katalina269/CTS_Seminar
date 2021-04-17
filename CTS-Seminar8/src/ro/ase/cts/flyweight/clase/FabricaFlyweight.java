package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
	private Map<String, FlyWeightAbstract> clienti ;

	public FabricaFlyweight() {
		this.clienti = new HashMap<>();
	}
	
	public FlyWeightAbstract getClient(String telefon) {
		Client client=(Client) clienti.get(telefon);
		if(client==null) {
			client=new Client("Gigel",telefon,"gigel@yahoo.com");
			clienti.put(telefon, client);
		}
		return client;
	}
	
	

}