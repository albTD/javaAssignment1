package assignmentPackage;

import java.util.Scanner;

public class output14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n,temp;
		int rev=0;
		while(num>0) {
			temp=num%10;
			rev*=10;
			rev+=temp;
			num=num/10;
		}
		
		System.out.print(rev);
	}

}
