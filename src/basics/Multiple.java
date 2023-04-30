package basics;
import java.util.Scanner;

public class Multiple {
	public static void main(String args[]) {
		System.out.print("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
			int result = (n/100+1)*100;
			System.out.println(result);
		
		
		
	}

}
