package com.String;

public class StringComparision {

	public static void main(String[] args) {
		String stringdata="LiveTech";
System.out.println(stringdata);
int stringdatalenght=stringdata.length();
System.out.println("The lenght of the string variable is: "+ stringdatalenght);
String stringDataConvertedToLowercase=stringdata.toLowerCase();
System.out.println("The variable value after converting to lowercase is : "+stringDataConvertedToLowercase);
	
String stringDataConvertedToUppercase=stringdata.toUpperCase();	
System.out.println("The variable value after converting to Uppercase is : "+stringDataConvertedToUppercase);
	String stringdata1="LiveTech Technologies";
	String stringdata2="LiveTech";
	if(stringdata1.equals(stringdata2))
	{
		System.out.println("Both Strings are equal");
	}
	else
	{
		System.out.println("Both Strings are not equal");

	}
	String stringdata3="LiveTech Technologies";
	String stringdata4="livetech technologies";
	if(stringdata3.equalsIgnoreCase(stringdata4))
	{
		System.out.println("Both Strings are equal");
	}
	else
	{
		System.out.println("Both Strings are not equal");

	}
	String stringdata5="LiveTech Technologies";
	String stringdata6="LiveTech";
	if(stringdata5.contains(stringdata6))
	{
		System.out.println("Both Strings are existing");
	}
	else
	{
		System.out.println("Both Strings are not existing");

	}
	String stringdata7="LiveTech Technologies";
	String stringdata8="livetech    technologies";
	if(stringdata7.equalsIgnoreCase(stringdata8))
	{
		System.out.println("Both Strings are matching");
	}
	else
	{
		System.out.println("Both Strings are not matching");
	
	}
	int charindex =stringdata7.charAt(3);
	System.out.println(charindex);
	System.out.println(stringdata7.charAt(3));
	}
	
	

}
