import java.util.Scanner;

public class Eleve {
	private String nom;
	private String prenom;
	private double mathe;
	private double fr;
	private double phy;
	private double ang;
	private double hist;
	private double sp;
	
	public Eleve(String n, String p,double mathe,double fr,double phy, double ang,double hist, double sp) {
		// TODO Auto-generated constructor stub
		this.nom=n;
		this.prenom=p;
		this.mathe=mathe;
		this.fr=fr;
		this.phy=phy;
		this.ang=ang;
		this.hist=hist;
		this.sp=sp;
	}
	
/*	public double moyenne(double mathe, double fr,double phy, double ang,double hist, double sp) {
		double moy = (mathe + fr+phy+ang+hist+sp) /6;
		System.out.println("la moyenne est de "+moy);
		return moy;
	}*/
	public void affiche()
	{
		double moy = (mathe + fr+phy+ang+hist+sp) /6;
		System.out.println(""+nom+" "+prenom+" a une moyenne de "+moy+" ses notes sont :\n Mathematiques :"+mathe+
				"\n francais: "+fr+
				"\n physique: "+phy+
				"\n anglais : "+ang+
				"\nhistoire/geo : "+hist+
				"\n sport: "+sp);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		
		System.out.println("nom ?");
		String nom = sc.nextLine();
		System.out.println("prenom ?");
		String prenom = sc.nextLine();
		System.out.println("note de math ?");
		double mathe = sc.nextDouble();
		System.out.println("note de fr ?");
		double fr = sc.nextDouble();
		System.out.println("note de phy ?");
		double phy = sc.nextDouble();
		System.out.println("note de ang ?");
		double ang = sc.nextDouble();
		System.out.println("note de hist/geo ?");
		double hist = sc.nextDouble();
		System.out.println("note de sport ?");
		double sp = sc.nextDouble();
		
		Eleve el = new Eleve(nom,prenom,mathe,fr,phy,ang,hist,sp);
	//	el.moyenne(mathe, fr,phy,ang,hist,sp);
		el.affiche();
	}

}
