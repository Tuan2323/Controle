import java.util.Scanner;


public class Calculatrice {
	private   double resultat=0.0;
	
	public double readValeur() {		
		 Scanner sc =new Scanner(System.in);
		 double resultatt=sc.nextDouble();
		 return resultatt;
		
	}
	
		public double additionner (double nombres) {
		
		  resultat+=nombres;
	
			return resultat; 
	}
		public double multiplier (double nombres) {
			
			  resultat*=nombres;
		
				return resultat; 
		}
		
		public double diviser (double nombres) {
			
			  resultat/=nombres;
		
				return resultat; 
		}
		
	public void AffichMenu() {
		
		System.out.println("===================================================================================================");
		System.out.println("=       1) Tapez 1 pour  une opération d'addition        -------------------------------------------=");
		System.out.println("=       2) Tapez 2 pour une opération de soustraction -  -------------------------------------------=");
		System.out.println("=       3) Tapez 3 pour une opération de DIVISION  ----------------------------------------------=");
		System.out.println("=       0) Tapez ESC pour quitter                      ---------------------------------------------=");
		System.out.println("--------------------------------------------------------------------------------------------------=");
		System.out.println("===================================================================================================");
	}
	
	public double getResultat() {
		return resultat;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculatrice calculatrice = new Calculatrice();
		 int choixOperation;
		 boolean quit= false;
	      calculatrice.AffichMenu();
		  Scanner sc =new Scanner(System.in);	
		  String y ="STOP";
		 
		 do {
			   System.out.println("Veuillez choisir le code de l' opération" );
			   choixOperation=sc.nextInt();
			  // System.out.println("choixOperation" +choixOperation);
			  switch (choixOperation) {
			  
			  case 1:
				  System.out.println("Cette Opération choisie est l'addition/soustraction ");
			          
			          double x=0.00;
			         
			          do
			          {
			        	  System.out.println("Enter une valeur à additionner ou taper 0 pour afficher le résultat final ");
			        	  x = calculatrice.readValeur();        	    
			        	  calculatrice.resultat=calculatrice.additionner(x);
			            // System.out.println("X == "+x);
			              System.out.println(" Résulat = "+calculatrice.resultat);
			          }while(x!=0);
			          //System.out.println("veullier saisir un nombre");
			          System.out.println("Le résultat Finale  de l'opération est => "+calculatrice.resultat);
			          quit=true;
			      break;
			      
			  case 2:
				  System.out.println("L Opération choisie est la Multiplication  ");
				  
				  double m =1.00;
		          //String y ="STOP";
		          do
		          {
		        	  System.out.println("Enter une valeur à multiplier ou taper 0 pour afficher le résultat final ");
		        	  m = calculatrice.readValeur();        	    
		        	  calculatrice.resultat=calculatrice.multiplier(m);
		            // System.out.println("X == "+x);
		              System.out.println(" Résulat = "+calculatrice.resultat);
		          }while(m!=0);
		          //System.out.println("veullier saisir un nombre");
		          System.out.println("Le résultat Finale  de l'opération est => "+calculatrice.resultat);
				  quit=true;
				 break;
				  
			  case 3:
				  System.out.println("L Opération chosie est la division  ");
				  quit=true;
				 break;
				  
			  case 0:
				 // System.out.print("Au revoir");
				  quit=true;
				  break;
				  
			default:
				  System.out.println("choix non reconnu veuillez resaisir UNE OPERATION VALIDE SINON TAPEZ 0 pour sortir");
//				  System.out.println("bonjjjjjjjjjjjjj");
////				  calculatrice.AffichMenu();
  				   // choixOperation=sc.nextInt();
  				 
			  }				  
			//  choixOperation=sc.nextLine(); 
			// break;
		 }while(!quit);		  
		  System.out.println("----Fin des opéartion Au revoir-----");
      
}
}
