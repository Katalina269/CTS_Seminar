package ro.ase.cts.state2.program;
import ro.ase.cts.state2.clase.Masa;


public class Program {
	public static void main (String args[]) {
		Masa masa = new Masa(123);
        masa.ocupaMasa();
        masa.rezervaMasa();
        //metoda setStare a devenit default  =  nu puteam modifica starea din main
        //masa.setStare(new Libera());
        masa.rezervaMasa();
        masa.elibereazaMasa();
	}

}
