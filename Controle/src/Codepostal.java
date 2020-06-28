import java.util.Scanner;

public class Codepostal {
	private String postal;
	
	public Codepostal(String p) {
		this.postal= p;
	}
	
	public void conditionCode(String postal) {
		if(postal.length()==5) {
			System.out.println("le CP est good");
		}
		if(postal.length()<5){
			System.out.println("le CP est trop court");
		}
		if(postal.length()>5){
			System.out.println("le CP est trop long");
		}
	}
	public static boolean isANumber(String postal) {
		 boolean ret = true;
		    try {

		        Double.parseDouble(postal);

		    }catch (NumberFormatException e) {
		        ret = false;
		    }
		    return ret;
		}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le Code Postal ?");
		String postal = sc.nextLine();
		Codepostal c1 = new Codepostal(postal);
		c1.conditionCode(postal);
		if (c1.isANumber(postal)== true) {System.out.println("le code postal "+postal+" est bon");}
		else {System.out.println("le code postal "+postal+" n'est pas bon");}
}
	}
