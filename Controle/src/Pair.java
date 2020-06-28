import java.util.Scanner;

public class Pair {
	private double nombre;
	

	public Pair(double n) {
		// TODO Auto-generated constructor stub
		this.nombre=n;
	}
public void ctrlpair(double nombre)
{
	if(nombre%2==0)
	System.out.println("un nombre "+nombre+"est pair");
	
else System.out.println("un nombre "+nombre+"est impair");
}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("un nombre ?");
		double nombre = sc.nextDouble()	;
		
		Pair p1 = new Pair(nombre);
		p1.ctrlpair(nombre);
		
		}

}
