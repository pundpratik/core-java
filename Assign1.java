/*accept two integer values via CLA* and perform all arithmetic operation*/
public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a= Integer.parseInt(args[0]);
		b=Integer.parseInt(args[0]);
		c=a+b;
		System.out.println("addition of two number is"+c);
		c=a-b;
		System.out.println("subtraction of two number is"+c);
		c=a*b;
		System.out.println("multiplication of two number is"+c);
		c=a/b;
		System.out.println("division of two number is"+c);


		
	}

}
