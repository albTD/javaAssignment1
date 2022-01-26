package assignmentPackage;

import java.util.Scanner;

public class output8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Pattern 1");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				if(j<=i) {
					System.out.print(i+1);
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 2");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
					System.out.print(n);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern 3");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				
				if( j>=(n-(i+1)) ) { 
					System.out.print("*");
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
