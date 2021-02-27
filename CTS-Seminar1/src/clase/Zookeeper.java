package clase;

public class Zookeeper {
	private String ingrijitor;

	public String getIngrijitor() {
		return ingrijitor;
	}

	public void setIngrijitor(String ingrijitor) {
		this.ingrijitor = ingrijitor;
	}

	public Zookeeper(String ingrijitor) {
		super();
		this.ingrijitor = ingrijitor;
	}
	
    public void feed(Animal a) {
    	System.out.println("Ingrijitorul" + this.ingrijitor + ", hraneste animalul => " + a.getNume());
    }
}
