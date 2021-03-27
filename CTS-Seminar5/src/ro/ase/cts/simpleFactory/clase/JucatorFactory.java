package ro.ase.cts.simpleFactory.clase;

public class JucatorFactory {
	public Jucator createJucator(TipJucator tipJucator, String nume) throws Exception {
		switch (tipJucator) {
		case Portar:
			return new Portar(nume);
		case Fundas:
			return new Fundas(nume);
		case Atacant:
			return new Atacant(nume);
		default:
			throw new Exception("Nu este un tip valid");
		}
		
	}


}
