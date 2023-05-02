package loop;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first no");
		int a=s.nextInt();
		System.out.print("Enter second no");
		int b=s.nextInt();
		int gcd=1;
		int i;
		for(i=1; i<=a && i<=b; i++) {
			if(a%i==0 && b%i==0) {
				
			gcd =i;
			}
		}
		System.out.print("GCD:"+gcd);
		
	}

}
