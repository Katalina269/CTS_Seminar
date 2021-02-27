package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeper;
	//tipuri de relatii 1 obiect zoo are un obiect de tip  zookeeper
	private List<Animal> animale;
    
    // nu initializeaza atributele si trebuie sa o facem manual
	public Zoo() {
		super();
		// cum intiliazez un obiect  - prin constructor
		// new Zoo returneaza o referinta  la un obiect
		this.zookeper= new Zookeeper("Marcel");
		
		// initializare lista de Animale
		this.animale = new ArrayList<Animal>();
	}


	public Zoo(Zookeeper zookeper, List<Animal> animale) {
		super();
		this.zookeper = zookeper;
		this.animale = animale;
	}


	public Zookeeper getZookeper() {
		return zookeper;
	}

	public void setZookeper(Zookeeper zookeper) {
		this.zookeper = zookeper;
	}
// metoda care adauga un animal in colectia de animale
	public void adaugaAnimal(Animal a) {
		this.animale.add(a);
		// daca nu alocam spatiu pentru lista aici am fi avut eroare
	}
// metoda  prin  care ingrijitorul  hraneste toate animalele din lista
	public void hranesteAnimale() {
		for(Animal a : animale) {
			zookeper.feed(a);
		}
	}
	
	public void  mutareAnimale() {
		for(Animal a: animale) {
			a.merge();
		}
	}
}
