package ro.ase.cts.composite.clase;

public interface Sediu {
	void descriere();
	void adaugaSediu(Sediu sediu) throws Exception;
	void stergeSediu(Sediu sediu) throws Exception;
	Sediu getSediu(int pozitie) throws Exception;
}
