package Switchstatements;

import java.util.Scanner;

public class switchCase {
	public static void choice() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice \n1.addition \n2.subtraction\n3.division\n4.multiplication\n5.exit ");
		int ch=sc.nextInt();
		switch(ch) 
		{
			case 1:
				System.out.println("addition= "+(a+b));
				break;
			case 2:
				System.out.println("subtraction= "+(a-b));
				break;
			case 3:
				System.out.println("division= "+(a/b));
				break;
			case 4:
				System.out.println("multiplication= "+(a*b));
				break;
			case 5:
				System.exit(0);
			default:
				//System.out.println("you have enter wrong choice");
				switchCase.choice();
		}
	}

	public static void main(String[] args) {
		switchCase.choice();

}
}
