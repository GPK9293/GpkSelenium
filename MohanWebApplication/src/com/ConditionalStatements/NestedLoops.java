package com.ConditionalStatements;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

for(int i=1; i<=5; i++)
{
	for(int j=5;j>=i; j--)
	{
		System.out.print("5");
	}
	System.out.println();
}

for(int i=1; i<=5; i++)
{
	for(int j=1;j<=i; j++)
	{
		System.out.print("*");
	}
	System.out.println();		
		
}

	for(int i=1; i<=3; i++)
	{
		for(int j=1;j<=i; j++)
		{
			System.out.print("5");
		}
		System.out.println();		
			
	}
	
	for(int i=1; i<=5; i++)
	{
		for(int j=1;j<=i; j++)
		{
			System.out.print(j);
		}
		System.out.println();	
	}

	
	      for(int i=1;i<=1;i++)
     {
    	 for(int j=1;j<=10;j++)
    	 
    	 {
    	 System.out.println(+i+"*"+j+"="+(i*j));
    	 }
     }
		
}
}
