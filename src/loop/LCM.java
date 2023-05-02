//package basics;
//import java.util.Scanner;
//
//public class LCM {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.print("Enter first no");
//		int a=s.nextInt();
//		System.out.print("Enter second no");
//		int b=s.nextInt();
//		int lcm,i;
//		for(i=1; i<a*b; i++) {
//			if(i%a==0 && i%b==0) {
//				break;
//			}
//		}
//		lcm=i;
//		System.out.print(lcm);
//
//	}
//
//}

//Second Approach
package loop;
import java.util.Scanner;

public class LCM {

public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
			System.out.print("Enter first no");
			int a=s.nextInt();
			System.out.print("Enter second no");
			int b=s.nextInt();
			int l=a>b?a:b;
			int lcm,i;
		    for(i=l; i<a*b; i+=l) {
		    	if(i%a==0 && i%b==0) {
		    		break;
		    	}
		    }
		    lcm=i;
		    System.out.println(lcm);
    }
 }

