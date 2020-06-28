import java.util.Scanner;

public class Equation {
private int a,b,c;

	public Equation(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public void calculD(int a, int b , int c)
	{
		int d = (b*2)-(4*a*c);
		if (d==0)System.out.println("l'equation de type "+a+"x2+"+b+"x + "+c+" =0  d="+d+" donc a une solution");
		if (d<0)System.out.println("l'equation de type "+a+"x2+"+b+"x + "+c+" =0  d="+d+" doncna pas de solution R");
		if (d>0)System.out.println(" l'equation de type "+a+"x2+"+b+"x + "+c+"  =0  d="+d+" donc a 2 solutions");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in); // active le clavier
		
		System.out.println("saisissez a ");
		int a = sc.nextInt();
		System.out.println("saisissez b ");
		int b = sc.nextInt();
		System.out.println("saisissez c ");
		int c = sc.nextInt();
		
		Equation e1 = new Equation(a,b,c);
		e1.calculD(a, b, c);
	}

}
