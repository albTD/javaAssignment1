package assignmentPackage;

import java.util.Scanner;

public class output10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		int p1=sc.nextInt();
		int p2=sc.nextInt();
		
		int temp=arr[p1-1];
		arr[p1-1]=arr[p2-1];
		arr[p2-1]=temp;
	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
