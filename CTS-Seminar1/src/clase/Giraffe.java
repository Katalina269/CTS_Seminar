package clase;

public class Giraffe extends Animal {
	public Giraffe(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}
	
	private int greutate;

	public int getGreutate() {
		return greutate;
	}
	

	public Giraffe(String nume, int greutate) {
		super(nume);
		this.greutate = greutate;
	}


	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}


	@Override
	public void merge() {
		// TODO Auto-generated method stub
		System.out.println("Girafa merge cu capul in nori");
		
	}
	

}
