import java.util.Scanner;

public class AffPair {
	private int nombre;

	public AffPair(int n) {
		// TODO Auto-generated constructor stub
		this.nombre=n;
	}

	
	public void affiche(int i)
	{
		if (i%2==0)System.out.println(" "+i);
		else System.out.println(" ");
	}
	
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("choix ?");
		int n = sc.nextInt();
		
		int i;
		for(i=0;i<=n;i++) {
		AffPair ap1 = new AffPair(i);
		ap1.affiche(i);
		}
	}

}
