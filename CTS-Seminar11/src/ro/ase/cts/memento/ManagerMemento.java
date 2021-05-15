package ro.ase.cts.memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {
	private List<Memento>  listaMemento;

	public ManagerMemento() {
		super();
		this.listaMemento = new ArrayList<>();
	}
	
	public void adaugaMemento(Memento memento) {
		listaMemento.add(memento);
		}
	public Memento getMemento(int pozitie) {
		if(pozitie >=0 && pozitie <listaMemento.size()) {
			return this.listaMemento.get(pozitie);
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public Memento getLastMemento() {
		if(listaMemento.size() >0) {
		return this.listaMemento.get(this.listaMemento.size() -1);	}
		throw new IndexOutOfBoundsException() ;
	}
	

}
