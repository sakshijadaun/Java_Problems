package basics;
import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  int N = s.nextInt();
		     if(N % 2 != 0){
		        System.out.print("weird");
		     }else if(N % 2 == 0 && N>=2 && N<=5){
		        System.out.print("Not weird");
		     }else if(N % 2 == 0 && N>=6 && N<=20){
		        System.out.print("weird");
		     }else{
		        System.out.print("Not weird");
		     }
	}
}
