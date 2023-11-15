package tp5;

 public class PropPrivee extends Propriete{
	private int nbPieces;

	public PropPrivee(int id, Personne reponsable, String adresse, double surface,int nbPieces) {
		super(id, reponsable, adresse, surface);
		this.nbPieces=nbPieces;
	}
	
	public int getNbPieces() {
		return nbPieces;
	}

	

	double calculImpot() {
		return (surface/100)*50+nbPieces*10;
		
	}
	



	

}
