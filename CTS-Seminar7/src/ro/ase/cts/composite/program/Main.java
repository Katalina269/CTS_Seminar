package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Agentie;
import ro.ase.cts.composite.clase.Filiala;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Agentie agentie1 = new Agentie("Agentia 1");
		Agentie agentie2 = new Agentie("Agentia 2");
		
		Filiala filiala1 = new Filiala("Filiala 1");
		Filiala filiala2 = new Filiala("Filiala 2");
		Filiala filiala3 = new Filiala("Filiala 3");

		agentie1.adaugaSediu(filiala1);
		agentie2.adaugaSediu(filiala2);
		agentie2.adaugaSediu(filiala3);
	
		agentie1.adaugaSediu(agentie2);
		
		agentie1.descriere();
	}

}
