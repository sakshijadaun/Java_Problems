package basics;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first no");
		int n1=s.nextInt();
		System.out.print("Enter second no");
		int n2=s.nextInt();
		System.out.print("Enter third no");
		int n3=s.nextInt();
		if(n1 >= n2 && n1>=n3) {
			System.out.print(n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.print(n2);
		}else {
			System.out.print(n3);
		}
	}

}
