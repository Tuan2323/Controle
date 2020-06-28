import java.util.Scanner;

public class AppIF {
	private int age;
	

	public AppIF(int a) {
		// TODO Auto-generated constructor stub
		this.age=a;
	}
	
	public void conditionAge(int age) {
		if(age<18) {
			System.out.println("mineur");
		}
		else {
			System.out.println("majeur");
		}
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		System.out.println("age ?");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		AppIF a1 = new AppIF(age);
		a1.conditionAge(age);
	}

}
