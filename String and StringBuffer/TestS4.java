//Write a java program that will return the first half of the string,
//if the length of the string is even. It should return null for odd length string.
package deepika;
import java.util.*;
public class TestS4{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int len = s1.length();
		if(len%2 == 0) System.out.println(s1.substring(0,len/2));
		else System.out.println("null");
	}
}
