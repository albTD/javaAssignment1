package assignmentPackage;

import java.util.Scanner;

public class output2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.print("a="+a+" ,b="+b);
	}

}
