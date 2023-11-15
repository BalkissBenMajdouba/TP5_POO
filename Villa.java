package tp5;

 public class Villa extends PropPrivee {
	boolean avecPiscine;
	public Villa(int id, Personne reponsable, String adresse, double surface, int nbPieces,boolean avecPiscine) {
		super(id, reponsable, adresse, surface, nbPieces);
		this.avecPiscine=avecPiscine;
		
	}
	@Override
	public String toString() {
		return super.toString()+" Villa [avecPiscine=" + avecPiscine + "]";
	}
	double calculImpot() {
		if(avecPiscine) {
			return super.calculImpot()+200;
		}
		else 
			return super.calculImpot();
		
		
	}

}
