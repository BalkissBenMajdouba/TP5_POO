package tp5;

public class LotissementPrivee extends Lotissement implements GestionPropriete{

	LotissementPrivee(int capactie) {
		super(capactie);
	}
	 @Override
	    public boolean ajouter(Propriete p) {
	        if (p instanceof PropPrivee) {
	            return super.ajouter(p);
	        } else {
	            return false;
	        }
	    }
	 @Override
	    public PropPrivee getpropriétéByIndice(int i) {
	        if (tabProp[i] instanceof PropPrivee) {
	            return (PropPrivee) tabProp[i];
	        } else {
	            return null;
	        }
	    }
	  @Override
	    public int getnbPièces() {
	        int nbTotalPieces = 0;
	        for (int i = 0; i < nombre; i++) {
	            if (tabProp[i] instanceof PropPrivee) {
	                nbTotalPieces += ((PropPrivee) tabProp[i]).getNbPieces();
	            }
	        }
	        return nbTotalPieces;
	    }
	

}
