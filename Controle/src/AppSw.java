import java.util.Scanner;

public class AppSw {
	
	
	public AppSw() {
		// TODO Auto-generated constructor stub
	}

	public void methChoix()
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("choix ?");
		int choix = sc.nextInt();
		
		
		switch(choix) {
		
		case 1 : 
			System.out.println("Vous avez vhoisi le choix + le resultat est ");
			break;
			
		case 2 : 
			System.out.println("Vous avez vhoisi le choix 2 ");
		break;
		
		default : System.out.println("Mauvais choix");
	}
	}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		
			
			
		AppSw as1 = new AppSw();
		as1.methChoix();
		
	}

}
