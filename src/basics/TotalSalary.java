package basics;
import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        int basic=s.nextInt();
	        char grade=s.next().charAt(0);
	        
	        double hra,da,pf;
	        hra=0.2*basic;
	        da=0.5*basic;
	        pf=0.11*basic;
	        int allow;
	        double totalSalary;
	        
	        if(grade=='A'){
	            allow=1700;
	            totalSalary=basic+hra+da+allow-pf;
	            System.out.println(Math.round(totalSalary));
	        }
	        else if(grade=='B'){
	            allow=1500;
	            totalSalary=basic+hra+da+allow-pf;
	            System.out.println(Math.round(totalSalary));
	        }
	        else{
	            allow=1300;
	            totalSalary=basic+hra+da+allow-pf;
	            System.out.println(Math.round(totalSalary));
	            
	        }
			

	}

}
