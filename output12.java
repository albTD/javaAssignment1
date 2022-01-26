package assignmentPackage;

import java.util.Scanner;

public class output12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=2;
		
		while(num<n) {
			if(n%num==0)
			{	System.out.println("Not prime");
                break;			
			}
			else
				num+=1;
				
		}
		
		if(num==n)
		System.out.println("prime");
		
	}

}
