package basics;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[]) {
	        System.out.print("Enter a number");
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int sum=0,digit=0;
	        while(n>0) {
	        digit = n%10;
	        sum += digit;
	        n /= 10;
	      
	}
	        System.out.println(sum);
	
	}

}
