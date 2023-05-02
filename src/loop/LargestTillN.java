package loop;
import java.util.Scanner;

public class LargestTillN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=s.nextInt();
		int large=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
    	for(int i=0; i<n; i++) {
			int num=s.nextInt();
			if(num>large) { 
				large=num;
			}
			if(num<small) {
				small=num;
			}
		}
		System.out.println(large);
		System.out.println(small);
	}

}
