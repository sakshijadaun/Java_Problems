package basics;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int temp=0;
			for(int i=2; i<=n-1; i++) {
				if(n%i==0) {
					temp += 1;
				}
			}
			if(temp>0) {
				System.out.print("Not Prime");
			}else {
				System.out.print("Prime");
			}
			
		}

}
