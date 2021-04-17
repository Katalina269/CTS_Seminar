package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare r1=new Rezervare(1, 10, 11);
		Rezervare r2=new Rezervare(4, 2, 10);
		Rezervare r3=new Rezervare(6, 5, 7);
		
		
		FabricaFlyweight fabricaClienti=new FabricaFlyweight();
		Client client=(Client) fabricaClienti.getClient("1234");
		
		client.afiseazainformatii(r1);
		
		Client client2=(Client) fabricaClienti.getClient("5678");
		client2.afiseazainformatii(r2);
		
		 fabricaClienti.getClient("5678").afiseazainformatii(r3);

	}
 

}
