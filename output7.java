package assignmentPackage;

import java.util.Scanner;

public class output7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<(l+1)) {
			if(i%2==0)
				sum+=i;
			i++;
		}
		
		System.out.println(sum);
		
	}

}
