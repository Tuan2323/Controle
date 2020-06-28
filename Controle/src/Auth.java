import java.util.Scanner;

public class Auth {

	private String user="tuan";
	private String pass="azert";
	private String user2;
	private String pass2;
	
	
	public Auth(String u,String p) {
		// TODO Auto-generated constructor stub
		this.user2=u;
		this.pass2=p;
	}
	
	public void verif(String user2, String pass2) {
		if(user2.contentEquals(user))System.out.println("le nom d'utilisateur est bon");
		else System.out.println("le nom d'utilisateur n'est pas bon");
		
		if(pass2.contentEquals(pass))System.out.println("le password est bon");
		else System.out.println("le password n'est pas bon");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("saisir le nom d'utilisateur ?");
		String user2 = sc.nextLine();
		System.out.println(" le password ?");
		String pass2 = sc.nextLine();
		Auth a1 = new Auth(user2,pass2);
		a1.verif(user2,pass2);
		
	
	}

}