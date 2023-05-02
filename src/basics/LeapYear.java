package basics;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any year: ");
		int year=s.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.print("It is a leap Year");
		}else{
			System.out.print("It is not a leap Year");
		}

	}

}
