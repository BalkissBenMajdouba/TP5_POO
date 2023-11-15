package tp5;

public class Fiscalite {
	public static void main(String...args) {
		Personne p1=new Personne(123, "AMINE", "MED");
		Personne p2=new Personne(456, "Balkiss", "bm");
		Personne p3=new Personne(789, "Yessine", "Bmansour");
		

        Lotissement l1= new Lotissement(10) ;
        PropPrivee pp1=new PropPrivee(1,p1,"Corniche",350,4);
        Villa v1 =new Villa(2,p2,"Dar Chaabane", 400,6,true);
        Appartement ap1= new Appartement(3,p2,"Hammamet",1200,8, 3);
        PropProfessionnelle ppro= new PropProfessionnelle(4,p3,"Korba", 1000, 50,true);
        PropProfessionnelle ppro2=new PropProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false);
        l1.ajouter(pp1);
        l1.ajouter(v1);
        l1.ajouter(ap1);
        l1.ajouter(ppro);
        l1.ajouter(ppro2);
      
     
        System.out.println(" nb pieces : "+ l1.getnbPièces());
     //  l1.supprimer(ppro2);
    	l1.supprimerHammemet();
    	l1.afficherPropriétés();
    	 System.out.println("Moins impots !"+l1.MoinsImpots());
    	
     
      
        
        
		
	}

}
