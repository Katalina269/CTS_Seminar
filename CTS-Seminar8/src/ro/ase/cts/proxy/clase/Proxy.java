package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {
	
	private OperatorRezervare operator;
	private int numarMinimPersoane;
	
	public Proxy(OperatorRezervare operator, int numarMinimPersoane) {
		super();
		this.operator = operator;
		this.numarMinimPersoane = numarMinimPersoane;
	}



	@Override
	public void rezerva(int nrPersoane) {
		if(nrPersoane>=numarMinimPersoane) {
			operator.rezerva(nrPersoane);
		}else {
			System.out.println
			("Nu se poate realiza rezervarea pentru "+nrPersoane+"  va asteptam la restaurant!");
		}
		
	}
	
	

}