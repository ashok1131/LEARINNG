package Week.com;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number in between 1to7");
		int num =scan.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;	
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;	
		case 5:
			System.out.println("thursday");
			break;	
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;	
		default:
			System.out.println("invalid input");
		
		
			
		}
		
	

	}

}
