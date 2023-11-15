package tp5;

abstract public class Propriete  {
	int id;
	Personne reponsable;
	private String adresse;
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	double surface;
	public Propriete(int id, Personne reponsable, String adresse, double surface) {
		super();
		this.id = id;
		this.reponsable = reponsable;
		this.adresse = adresse;
		this.surface = surface;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName()+ "   [id=" + id + ", reponsable=" + reponsable + ", adresse=" + adresse + ", surface=" + surface
				+ "]";
	}
	abstract double calculImpot();
	/*@Override
	public boolean equals(object o) {
		
	}*/
	public Personne getReponsable() {
		return reponsable;
	}
	
	
}
