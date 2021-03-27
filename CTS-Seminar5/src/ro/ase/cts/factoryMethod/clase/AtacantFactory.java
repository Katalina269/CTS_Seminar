package ro.ase.cts.factoryMethod.clase;

public class AtacantFactory implements JucatorFactory {

	@Override
	public Jucator creareJucator(String nume) {
		// TODO Auto-generated method stub
		return new Atacant(nume);
	}

}
