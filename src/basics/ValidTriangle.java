package basics;
import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter first number");
		int a = s.nextInt();
		System.out.print("Enter second number");
		int b = s.nextInt();
		System.out.print("Enter third number");
		int c = s.nextInt();
		if(a+b>c && b+c>a && c+a>b) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
		

	}

}
