package loop;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no:");
        int n=s.nextInt();
        int fTerm=0,sTerm=1;
        for(int i=1; i<=n; i++) {
        	System.out.print(fTerm+",");
        	int nTerm=fTerm+sTerm;
        	fTerm=sTerm;
        	sTerm=nTerm;
        	
        }
        
	}

}
