package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.Restaurant;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Restaurant restaurant = new Restaurant("Volare","Bucuresti,sector 3");
Client client1 = new Client("Gigel");
Client client2 = new Client("Florin");
restaurant.adaugaObserver(client1);
restaurant.adaugaObserver(client2);
restaurant.realizeazaOfertaPret();

} }
