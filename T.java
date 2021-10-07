package com.Exception;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0,c=0;
		try {
			c=a/b;//object creation of Exception
			
		}catch(Exception e)
		{
			System.out.println("inf");
		}
		System.out.println(c);

	}

}
