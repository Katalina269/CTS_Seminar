package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.IOperatorRezervare;
import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.Proxy;

public class Program {

	private static  void functie(IOperatorRezervare operator, int nrPersoane) {
		operator.rezerva(nrPersoane);
	}

	public static void main(String[] args) {
		OperatorRezervare operator1=new OperatorRezervare("Local");
		functie(operator1,2);
		
		Proxy proxy=new Proxy(operator1, 4);
		proxy.rezerva(2);
		proxy.rezerva(5);
		
		functie(proxy,4);
		
	}


}
