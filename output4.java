package assignmentPackage;

import java.util.Scanner;

public class output4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println("vowel");
		else
			System.out.println("not vowel");
		
		switch(c) {
		
		case 'a':{
			System.out.println("vowel");
		}
		case 'e':{
			System.out.println("vowel");
		}
		case 'i':{
			System.out.println("vowel");
		}
		case 'o':{
			System.out.println("vowel");
		}
		case 'u':{
			System.out.println("vowel");
		}
		case 'A':{
			System.out.println("vowel");
		}
		case 'E':{
			System.out.println("vowel");
		}
		case 'I':{
			System.out.println("vowel");
		}
		case 'O':{
			System.out.println("vowel");
		}
		case 'U':{
			System.out.println("vowel");
		}
		default: System.out.println("Not vowel");
		
		}
		
	}

}
