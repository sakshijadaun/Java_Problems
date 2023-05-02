package loop;
import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int digit;
        int even=0,odd=0;
        while(num>0)
              {
            digit=num%10;
            num=num/10;
            if(digit%2!=0)
                odd=odd+digit;
            else
                even=even+digit;
        }
        System.out.print(even+" "+odd);

	}

}
