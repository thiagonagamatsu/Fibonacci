import java.util.Scanner;

public class Fibonnaci {

	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;
	int i;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	int	i = sc.nextInt();
		
		while (i > n3) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
		}
		if (i==0) {
			System.out.println("O numero 0 est� na sequencia de fibonacci. ");
		} else if (i == n3) {
			System.out.println("O numero est� na sequencia de fibonacci. ");
		} else {
			System.out.println("Este numero n�o faz parte da sequencia de fibonacci. ");
		}
		
		sc.close ();
	}

	
}
