package assignmentPackage;

import java.util.Scanner;

public class output11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int prod=1;
		for(int i=0;i<n;i++) {
			prod*=num;
			num-=1;
		}
		
		System.out.println(prod);
		
		
	}

}
