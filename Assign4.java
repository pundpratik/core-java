/*Accept five different values via CLA* by using for loop and display sum of that values*/
public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0,i;
		for( i=0;i<5;i++)
		{
			a= Integer.parseInt(args[i]);
			//System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sumof entered element is "+sum);
		
	}

}
