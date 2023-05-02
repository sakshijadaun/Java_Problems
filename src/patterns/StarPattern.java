package patterns;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		System.out.print("Enter a no");
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=n; col++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
