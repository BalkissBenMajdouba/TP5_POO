package tp5;


public  class Lotissement implements GestionPropriete{
	protected Propriete [] tabProp;
	protected int nombre;
	
	Lotissement(int capactie){
		if(capactie<=Max_Prop) {
			this.tabProp=new Propriete[capactie];
		}
		else {
			System.out.println("try again! ");
		}
		 this.nombre = 0;
		
	}
	
	Propriete getpropriétéByIndice (int i)
	{
		 Propriete a=null;
		if((i>0)&&(i<nombre)) {
			 a= tabProp[i];
		}
		return a;
	
	
	}
	
	 public int getnbPièces() {
	        int nbTP = 0;
	        for (int i = 0; i < nombre; i++) {
	            if (tabProp[i] instanceof PropPrivee) {
	            	nbTP += ((PropPrivee) tabProp[i]).getNbPieces();
	            }
	        }
	        return nbTP;
	    }
		
	/*int s=0;
	for(int j=0; j<nombre;j++) {
		if(tabProp[j] instanceof PropPrivee) {
			s+=((PropPrivee )tabProp[j]).getNbPieces();
		}
	}
	return s;*/
	

	@Override
	public void afficherPropriétés() {
		// TODO Auto-generated method stub
		for(int i=0; i<nombre;i++)
		{
			System.out.println();
			System.out.println(tabProp[i]+" Impot a payer : "+tabProp[i].calculImpot());
		}
	}

	@Override
	public boolean ajouter(Propriete p) {
		if (nombre<tabProp.length) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else 
			System.out.println(" Impossible d'ajouter !");
		return false;
	}
	

	@Override
	public boolean supprimer(Propriete p) {
		// TODO Auto-generated method stub
		for (int i=0;i<nombre;i++) {
            if (tabProp[i].equals(p)) {
                for (int j=i;j<nombre-1;j++) {
                	tabProp[j] = tabProp[j+1];
                }
                nombre--;
                return true;
            }
          
                
	}
		return false;
		
	 }
	
	
	public void supprimerHammemet() {
		// TODO Auto-generated method stub
		for (int i=0;i<nombre;i++) {
            if (tabProp[i].getAdresse().equals("Hammemet")) {
                for (int j=i;j<nombre-1;j++) {
                	tabProp[j] = tabProp[j+1];
                }
                nombre--;
            }  
	}}
	
		
	  public double MoinsImpots() {
		
		  PropPrivee moins=null; 
		
	
		for(int i=0; i<nombre;i++) {
			if(tabProp[i] instanceof PropPrivee){
				if(moins == null||tabProp[i].calculImpot()<moins.calculImpot()) {
					
					moins=(PropPrivee) tabProp[i];
				}
			}
			
		}
	 return moins.calculImpot() ;
		//+ moins.calculImpot()
	}
	  
	

	
	}

	 
