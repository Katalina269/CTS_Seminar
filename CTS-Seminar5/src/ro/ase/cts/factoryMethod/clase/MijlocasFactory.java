package ro.ase.cts.factoryMethod.clase;

public class MijlocasFactory implements JucatorFactory{

	@Override
	public Jucator creareJucator(String nume) {
		// TODO Auto-generated method stub
		return new Mijlocas(nume);
	}

}