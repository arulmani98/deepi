/*
 * Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)
i/p:Sachin,Tendulkar
o/p:sachin tendulkar

Example2)
i/p:Mark,kate
o/p:markate*/
package deepika;
import java.util.*;
public class TestS2{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String str1 = s.next().toLowerCase(); 
		String str2= s.next().toLowerCase();
		String a1 = str1.substring( str1.length()-1); 
		String a2 =  str2.substring(0,1);
		if( a1.equals(a2))
			System.out.println(  str1.concat( str2.substring(1, str2.length())));
		else System.out.println(  str1.concat( str2));
	}
}
