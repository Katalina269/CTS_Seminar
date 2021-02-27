package ro.ase.cts;

import clase.Animal;
import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo();
		Animal a = new Zebra("Florin");
		Animal a2= new Zebra ("Maricica");
		
		Animal a3 = new Giraffe("FruFru");
		Animal a4 = new Giraffe("FriFri");
		
		
		zoo.adaugaAnimal(a);
		zoo.adaugaAnimal(a2);
		
		zoo.adaugaAnimal(a3);
		zoo.adaugaAnimal(a4);
		
		zoo.hranesteAnimale();
		zoo.mutareAnimale();

	}

}
