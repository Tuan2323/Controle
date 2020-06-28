import java.util.Scanner;

public class Cafe {
	private int choix;
	private int taille;
	private int eau;
	
	
Scanner sc = new Scanner(System.in);

	public Cafe(int choix, int taille, int eau) {
		// TODO Auto-generated constructor stub
this.choix=choix;
this.taille=taille;
this.eau=eau;

	}
	
	public int retireEau(int eau, int taille) {
		eau= eau-taille;
		System.out.println("et il reste"+eau);
		return eau;
		
	}

	
	public void methChoixcafe(int choix)
	{
Scanner sc = new Scanner(System.in);
		
		//System.out.println("choix cafe ?");
		//int choix = sc.nextInt();
		
		
		switch(choix) {
		
		case 1 : 
			System.out.println("Vous avez choisi cafe1 ");
			break;
			
		case 2 : 
			System.out.println("Vous avez choisi cafe2 ");
		break;
		
		default : System.out.println("Mauvais choix");
	}
	}
	
	public void methChoixtaille(int taille)
	{
Scanner sc = new Scanner(System.in);
		
		/*System.out.println("taille ?");
		int taille = sc.nextInt();*/
		
		
		switch(taille) {
		
		case 1 : 
			System.out.println("Vous avez cafe court ");
			
			break;
			
			
		case 2 : 
			System.out.println("Vous avez choisi cafe long ");
			break;
		
		
		default : System.out.println("Mauvais choix");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int eau=10;
		
		while (eau!=0&&eau>0) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choix cafe?");
		int choix = sc.nextInt();
		
		System.out.println("choix taille?");
		int taille = sc.nextInt();
		
		Cafe c1= new Cafe(choix,taille,eau);
	//	c1.methChoixcafe(choix);
	//	c1.methChoixtaille(taille);
		//c1.retireEau(eau, taille);
		eau=c1.retireEau(eau, taille);
		System.out.println("et il reste"+eau);
		
		
		
	}System.out.println("WARNING  remettre de leau");
	}
}
