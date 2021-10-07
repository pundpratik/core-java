package com.Exception;
class BankWd extends RuntimeException{
	int bal=500;
}
public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankWd b=new BankWd();
		int wd=100;
		try {
			if(wd>b.bal)
			{
				throw new BankWd();
			}else
				b.bal=b.bal-wd;
			System.out.println(b.bal);
		}
			catch(BankWd b1)
			{
				System.out.println("insuffiecient balance");
			}
		finally {
			System.out.println("collect your card");
		}
		
	}

}
