//string manipulaton

import java.util.Scanner;
public class string
{
	public static void main(String args[]){
	String s1,s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string1 : ");
	s1=sc.next();
	System.out.println("Enter string2 : ");
	s2=sc.next();
System.out.println("Whether both the strings are equal : "+s1.equals(s2));
System.out.println("Concatenate string2 to string1 : "+s1.concat(s2));
System.out.println("Length of string1 : "+s1.length());
System.out.println("Character at index 0 of string1 : "+s1.charAt(1));
System.out.println("Replace 'h' by 't' in string2 : "+s2.replace('h','t'));
	System.out.println(".Lowercase of string1 : "+s1.toLowerCase());
	System.out.println("Substring of string1 from index 2 to 5 : "+s1.substring(2,5));
	System.out.println("Index of 't' in string1 : "+s1.indexOf('t'));
	System.out.println("CompareTo function :"+s1.compareTo(s2));
	System.out.println("Whether the string2 contains 'nga' : "+s2.contains("nga"));
	System.out.println("Lowercase of string1 : "+s1.toLowerCase());
	System.out.println("Uppercase of string1 : "+s1.toUpperCase());
	
}
}