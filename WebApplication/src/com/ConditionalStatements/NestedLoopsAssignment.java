package com.ConditionalStatements;

public class NestedLoopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			
		{
			System.out.print("@");	
			}
			System.out.println();
		}

		for ( int i=1; i<=5;i++)
		{
			for(int j=1;i>=j;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for ( int i=1; i<=3 ;i++)
		{
			for(int j=1;i>=j;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		for (int i=3; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			
		{
			System.out.print("#");	
			}
			System.out.println();
		}
		int i=1;
		for(int j=1; j<=3; j++ )
		{
			System.out.println(+i+"*"+j+"="+(i*j));
			
		}
	}		
}			
		
		