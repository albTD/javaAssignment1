package assignmentPackage;

import java.util.Scanner;

public class output13 {

	int checkPrimee(int nn) {
		
		int n=nn;
		int num=2;
		
		while(num<n) {
			if(n%num==0)
				
			{	int ans=5;
				return ans;
                		
			}
			else
				num+=1;
				
		}
		
		if(num==n) {
			int ans=6;
			return ans;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        output13 obj=new output13();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int check;
		for(int i=2;i<=n;i++) {
			
			check=obj.checkPrimee(i);
			if(check==6)
			 System.out.print(i+" ");
			
		}

		
	}

}
