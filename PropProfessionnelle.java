package tp5;

	 public class PropProfessionnelle extends Propriete{
	int nbEmp;
	boolean estEtatique;

	public PropProfessionnelle(int id, Personne reponsable, String adresse, double surface,int nbEmp,boolean estEtatique) {
		super(id, reponsable, adresse, surface);
		this.nbEmp=nbEmp;
		this.estEtatique=estEtatique;
	}
	
	double calculImpot() {
		if(!estEtatique) {
			return (surface/100)*100+30*nbEmp;
		}
		else 
			return 0;
		
		
	}


	
}
