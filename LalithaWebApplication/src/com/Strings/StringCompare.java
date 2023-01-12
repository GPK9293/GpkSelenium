package com.Strings;

public class StringCompare{
	public static void main(String[] args) {
		String StringData="LiveTech";
		System.out.println(StringData);
		int StringDataLength=StringData.length();
		System.out.println("The Length of the String variable is:"+StringDataLength);
		//converting the string character to lowercase letters
	String StringDataConvertedToLowerCase=StringData.toLowerCase();
	System.out.println("The variable value after converting to LowerCase is :"+ StringDataConvertedToLowerCase);
        //Coverting the string character to Uppercase letters
	String StringDataconvertedtoupperCaseLetter=StringData.toUpperCase();
	System.out.println("The variable value after converting to UpperCase is:"+ StringDataconvertedtoupperCaseLetter);
	String StringData1="LiveTech Technologies";
	String StringData2="LiveTech";
	//convert the 2 strigs same are not in equal method
	if(StringData1.equals( StringData2))
	{
	System.out.println("Both string are equal");
	}
	else
	{
	System.out.println("Both string are not equal");
	}
	String StringData3="LiveTech Technologies";
	String StringData4="livetech technologies";
	
	//convert the 2 strigs same are not in equaland ignoring method
		if(StringData3.equalsIgnoreCase( StringData4))
		{
		System.out.println("Both string are matching");
		}
		else
		{
		System.out.println("Both string are not matching");
		}
		
		String StringData5="LiveTech Technologies";
		String StringData6="LiveTech";
		
		//convert the 2 strigs same are not in existancemethod
			if(StringData5.contains( StringData6))
			{
			System.out.println("Both string are Existing");
			}
			else
			{
			System.out.println("Both string are not Existing");
			}
			String StringData7="LiveTech Technologies";
			String StringData8="LiveTech       Technologies";
			
			//convert the 2 strigs same are not in Equalingnoring
				if(StringData7.equalsIgnoreCase( StringData8))
				{
				System.out.println("Both string are matching");
				}
				else
				{
				System.out.println("Both string are not matching");
	int charindex =StringData7.charAt(3);
	
	System.out.println(charindex);
	
	System.out.println(StringData7.charAt(3));
	
	
				
		
	
				}
}
}