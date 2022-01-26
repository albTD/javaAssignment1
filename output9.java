package assignmentPackage;

public class output9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr= {1,2,3,4,5};
		int temp;
		int limit;
		if(arr.length%2==0)
			limit=(arr.length/2);
		else
			limit=(arr.length/2)+1;
		
		for(int i=0;i<limit;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-(i+1)];
			arr[arr.length-(i+1)]=temp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
