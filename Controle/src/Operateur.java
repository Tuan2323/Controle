import java.util.Scanner;

public class Operateur {
	private double a,b;
	public Operateur(double a, double b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	public double addition(double a,double b)

	{
		double res = a+b;
		return res;
	}
	public double sous(double a,double b)

	{
		double res = a-b;
		return res;
	}	
	public double mult(double a,double b)

	{
		double res = a*b;
		return res;
	}	
	public double divi(double a,double b)

	{
		double res = a/b;
		return res;
	}
	public void methChoix(double a, double b)
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("choix ?");
		int choix = sc.nextInt();
		double res;
		switch(choix) {
		
		case 1 : res=addition(a,b);
			System.out.println("Vous avez choisi le choix + le resultat est "+res);
			break;
			
		case 2 : res=sous(a,b);
			System.out.println("Vous avez choisi le choix - le resultat est "+res);
		break;
		
		case 3 : res=mult(a,b);
			System.out.println("Vous avez choisi le choix * le resultat est "+res);
		break;
		
		case 4 : if (b!=0) {res=divi(a,b);
		System.out.println("Vous avez choisi le choix / le resultat est "+res);}
		else {System.out.println("mauvais b ");}
		break;
		
		default : 
			System.out.println("Mauvais choix");
					}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("choix a ?");
		double a = sc.nextInt();	
		System.out.println("choix b ?");
		double b = sc.nextInt();
		
		
	Operateur o1 = new Operateur(a,b);
	o1.methChoix(a,b);
	}

}
