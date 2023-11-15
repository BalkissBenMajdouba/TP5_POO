package tp5;

 public class Appartement extends PropPrivee {
	int numEtage;

	public Appartement(int id, Personne reponsable, String adresse, double surface, int nbPieces,int numEtage) {
		super(id, reponsable, adresse, surface, nbPieces);
		this.numEtage= numEtage;
	}

}
