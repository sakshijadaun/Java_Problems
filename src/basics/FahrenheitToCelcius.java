package basics;
import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		int s,e,w;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        e=sc.nextInt();
        w=sc.nextInt();
        int tableValue;
        while(s<=e){
                tableValue=((5*(s-32))/9);
                System.out.println(s+" "+tableValue);
                s+=w;
            }

	}

}
