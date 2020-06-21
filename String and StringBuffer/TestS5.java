/*
 * Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)
i/p:Suman
o/p:uma
 */
package deepika;

import java.util.Scanner;
public class TestS5 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int len = s1.length();
		for(int i = 0; i < len; i++){
			if(i != 0 && i != len-1) System.out.print(s1.charAt(i));
		}
	}
}
