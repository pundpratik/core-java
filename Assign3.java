/*Accept basic salary via CLA* and calculate the following
DA=20% of basic
HRA=30% of basic
Calculate gross salary GROSS=BASIC+DA+HRA
Calculate the Income tax (IT) based on the following condition
SAL RANGE
IT
-------------------------------------------------------------------
Basic >0 and basic < 4000   4%
Basic >=4000 and basic < 10000   6%
Basic >=10000 and basic < 17000    8%
Basic >=17000 and basic < 27000   10%
Basic >=27000 onwards   15%*/
public class Assign3 {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//void computesaalry(int basic)
		
			float da,hra;
			float gs;
			int basic;
			basic=Integer.parseInt(args[0]);
			da=basic*0.2f;
			hra=basic*0.3f;
			if(basic>0 && basic<4000)
			{
				gs=basic+da+hra;
				float it=(gs*0.04f);
				System.out.println("gross salary is ="+gs);
				System.out.println("income tax ="+it);
				
				
			}
			if(basic>=4000 && basic<10000)
			{
				gs=basic+da+hra;
				float it=(gs*0.06f);
				System.out.println("gross salary is ="+gs);
				System.out.println("income tax ="+it);
				
				
			}
			if(basic>=10000 && basic<17000)
			{
				gs=basic+da+hra;
				float it=(gs*0.08f);
				System.out.println("gross salary is ="+gs);
				System.out.println("income tax ="+it);
				
				
			}
			if(basic>=17000 && basic<27000)
			{
				gs=basic+da+hra;
				float it=(gs*0.1f);
				System.out.println("gross salary is ="+gs);
				System.out.println("income tax ="+it);
				
				
			}
			if(basic>=27000)
			{
				gs=basic+da+hra;
				float it=(gs*0.15f);
				System.out.println("gross salary is ="+gs);
				System.out.println("income tax ="+it);
				
				
			}
		
		
	}

}
