package ifstatements;

import java.util.Scanner;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your nationality ");
		String nationality=sc.next().toLowerCase();
		String s="indian";
		//System.out.println(nationality);
		if(age>=18) {
			if(nationality.equals(s)) {
				System.out.println("you are eligible for voting");
			}
			else {
				System.out.println("you are not authorise civilian of india");
			}
		}
		else
		{
			System.out.println(" sorry! you are not eligible for voting");
		}

	}

}
