package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card = new Card("Florin Popescu", 4500);
		card.realizeazaPlataNormala(50);
		card.realizeazaPlataOnline(15);
		System.out.println(card.getSold());
		
		DecoratorAbstract decoratorContactless = new DecoratorContactless(card);
		decoratorContactless.realizeazaPlataNormala(200);
		decoratorContactless.realizeazaPlataOnline(300);
		decoratorContactless.platesteContactless(250);
		
		DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
		decoratorContactlessTelefon.platesteContactless(100);
		
		System.out.println(card.getSold());
        
        
	}

}
